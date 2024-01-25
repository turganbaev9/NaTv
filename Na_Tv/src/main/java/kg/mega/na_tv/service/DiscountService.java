package kg.mega.na_tv.service;

import model.Discount;
import model.dto.DiscountDTO;

import java.util.List;

public interface DiscountService {
    DiscountDTO save(DiscountDTO discountDTO);
    List<Discount> findAll();
    void betweenDays(Discount discount);
}
