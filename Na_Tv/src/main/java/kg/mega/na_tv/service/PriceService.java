package kg.mega.na_tv.service;

import lombok.RequiredArgsConstructor;
import model.Price;
import model.dto.PriceDTO;

import java.util.List;

public interface PriceService {
    PriceDTO save(PriceDTO priceDTO);
    List<Price> findAll();
}
