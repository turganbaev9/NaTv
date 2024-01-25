package kg.mega.na_tv.service.Impl;

import kg.mega.na_tv.service.DiscountService;
import lombok.RequiredArgsConstructor;
import model.Discount;
import model.dto.DiscountDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DiscountServiceImpl implements DiscountService {
    @Override
    public DiscountDTO save(DiscountDTO discountDTO) {
        return null;
    }

    @Override
    public List<Discount> findAll() {
        return null;
    }

    @Override
    public void betweenDays(Discount discount) {

    }
}
