package kg.mega.na_tv.mapper;

import model.Price;
import model.dto.PriceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PriceMapper {
PriceMapper INSTANCE= Mappers.getMapper(PriceMapper.class);
    PriceDTO toDTO(Price price);
    Price toEntity(PriceDTO price);
    List<PriceDTO> toDtoList(List<Price>priceList);
    List<Price> toEntityList(List<PriceDTO>prices);
}