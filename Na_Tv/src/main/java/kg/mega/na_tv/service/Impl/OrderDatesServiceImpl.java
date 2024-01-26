package kg.mega.na_tv.service.Impl;

import kg.mega.na_tv.mapper.OrderDatesMapper;
import kg.mega.na_tv.repository.OrderDatesRep;
import kg.mega.na_tv.service.OrderDatesService;
import lombok.RequiredArgsConstructor;
import model.OrderDates;
import model.dto.OrderDatesDTO;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderDatesServiceImpl implements OrderDatesService {
    private final OrderDatesRep orderDatesRep;

    @Override
    public OrderDatesDTO save(OrderDatesDTO orderDatesDTO) {

        OrderDates orderDate = OrderDatesMapper.INSTANCE.toEntity(orderDatesDTO);
        return null;
    }
}
