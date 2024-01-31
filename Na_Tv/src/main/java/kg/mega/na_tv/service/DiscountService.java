package kg.mega.na_tv.service;

import kg.mega.na_tv.model.Discount;
import kg.mega.na_tv.model.dto.DiscountDTO;

import java.util.List;

public interface DiscountService {
    DiscountDTO save(DiscountDTO discountDTO);
    List<Discount> findAll();
    void betweenDays(Discount discount);
}
