package kg.mega.na_tv.service.Impl;

import kg.mega.na_tv.mapper.DiscountMapper;
import kg.mega.na_tv.repository.ChannelRep;
import kg.mega.na_tv.repository.DiscountRep;
import kg.mega.na_tv.service.DiscountService;
import lombok.RequiredArgsConstructor;
import model.Channel;
import model.Discount;
import model.dto.DiscountDTO;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
@Service
@RequiredArgsConstructor
public class DiscountServiceImpl implements DiscountService {
    private final DiscountRep discountRep;
    private final ChannelRep channelRep;
    @Override
    public DiscountDTO save(DiscountDTO discountDTO) {
        Discount discount= DiscountMapper.INSTANCE.toEntity(discountDTO);
        betweenDays(discount);
        Channel channel=channelRep.findById(discount.getChannel().getId()).orElse(null);
        discount.setChannel(channel);
        discountRep.save(discount);
        return DiscountMapper.INSTANCE.toDTO(discount);
    }
    public void betweenDays(Discount discount){
        Date startDate=discount.getStartDate();
        Date endDate=discount.getEndDate();
        if (startDate!=null&&endDate!=null) {
            Long amountDays = ChronoUnit.DAYS.between(startDate.toInstant(), endDate.toInstant());
            discount.setDiscountDays(Math.toIntExact(amountDays));
            if (discount.getDiscountDays() >= 3 && discount.getDiscountDays() < 7) {
                discount.setDiscount(0.15);
            } else if (discount.getDiscountDays() >= 7 && discount.getDiscountDays() < 10) {
                discount.setDiscount(0.20);
            } else if (discount.getDiscountDays() >= 10) {
                discount.setDiscount(0.30);
            }
        }
    }


    @Override
    public List<Discount> findAll() {
        return discountRep.findAll();
    }
}

