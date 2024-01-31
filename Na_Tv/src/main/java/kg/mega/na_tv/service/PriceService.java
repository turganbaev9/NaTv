package kg.mega.na_tv.service;

import kg.mega.na_tv.model.Price;
import kg.mega.na_tv.model.dto.PriceDTO;

import java.util.List;

public interface PriceService {
    PriceDTO save(PriceDTO priceDTO);
    List<Price> findAll();
}
