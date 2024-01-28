package kg.mega.na_tv.service.Impl;

import kg.mega.na_tv.mapper.OrderMapper;
import kg.mega.na_tv.repository.OrderRep;
import kg.mega.na_tv.repository.PriceRep;
import kg.mega.na_tv.service.OrderService;
import lombok.RequiredArgsConstructor;
import model.Discount;
import model.Order;
import model.Price;
import model.dto.OrderDTO;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRep orderRep;
    private final PriceRep priceRep;

    @Override
    public OrderDTO save(OrderDTO orderDTO) {
        Order order = OrderMapper.INSTANCE.toEntity(orderDTO);
        // Получаем информацию о цене и тексте для расчета
        Long priceId = orderDTO.getPrice().getId();
        Price price = priceRep.findPriceAndDiscountById(priceId);

        if (price != null) {
            // Расчет общей цены до скидки
            Double pricePerSymbol = price.getPricePerSimbol();
            Date startDate = price.getStartDate();
            Date endDate = price.getEndDate();
            long duration = ChronoUnit.DAYS.between(startDate.toInstant(), endDate.toInstant());
            Double totalPriceWithoutDiscount = pricePerSymbol * duration;

            // Проверяем, есть ли скидка
            Discount discount = price.getDiscount();
            if (discount != null) {
                // Расчет цены с учетом скидки
                double discountValue = discount.getDiscount();
                Double totalPriceWithDiscount = totalPriceWithoutDiscount * (1 - discountValue);
                //sendMail(orderDTO.getClientEmail(),"Your invoice saved"+totalPriceWithDiscount.doubleValue(),toString());

                order.setPriceBeforeDiscount(totalPriceWithoutDiscount);
                order.setPriceWithDiscount(totalPriceWithDiscount);
                order.setTotalSum(totalPriceWithDiscount); // Устанавливаем общую сумму с учетом скидки
            } else {
                // Если скидки нет, то общая цена будет такой же, как и цена без скидки
                order.setPriceBeforeDiscount(totalPriceWithoutDiscount);
                order.setPriceWithDiscount(totalPriceWithoutDiscount);
                order.setTotalSum(totalPriceWithoutDiscount);
            }

            // Устанавливаем цену и текст в заказ
            order.setPrice(price);
            order.setText(price.getText());
        }
        // Сохраняем заказ
        orderRep.save(order);
        return OrderMapper.INSTANCE.toDTO(order);
    }

    public List<Order> searchOrders(String query) {
        return orderRep.findByCreatedDateContainingOrFullNameClientContainingOrClientEmailContainingOrClientPhoneContaining(query);
    }

    @Override
    public List<Order> findAll() {
        return orderRep.findAll();
    }
}
