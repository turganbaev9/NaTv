package kg.mega.na_tv.service.Impl;

import kg.mega.na_tv.service.PriceService;
import lombok.RequiredArgsConstructor;
import model.Price;
import model.dto.PriceDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PriceServiceImpl implements PriceService {
    @Override
    public PriceDTO save(PriceDTO priceDTO) {
        return null;
    }

    @Override
    public List<Price> findAll() {
        return null;
    }
}
