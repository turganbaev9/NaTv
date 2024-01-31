package kg.mega.na_tv.mapper;

import kg.mega.na_tv.model.Discount;
import kg.mega.na_tv.model.dto.DiscountDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DiscountMapper {
DiscountMapper INSTANCE= Mappers.getMapper(DiscountMapper.class);
DiscountDTO toDTO(Discount discount);
Discount toEntity(DiscountDTO discountDTO);
    List<DiscountDTO> toDTOList(List<Discount>discounts);
    List<Discount>toEntityList(List<DiscountDTO>discountDTOS);

}
