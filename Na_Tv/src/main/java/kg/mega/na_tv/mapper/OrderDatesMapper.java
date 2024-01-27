package kg.mega.na_tv.mapper;

import model.OrderDates;
import model.dto.OrderDatesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderDatesMapper {
    OrderDatesMapper INSTANCE= Mappers.getMapper(OrderDatesMapper.class);
    OrderDatesDTO toDTO(OrderDates orderDates);
    OrderDates toEntity(OrderDatesDTO orderDatesDTO);
    List<OrderDatesDTO> toDTOList(List<OrderDates>orderDates);
    List<OrderDates>toEntityList(List<OrderDatesDTO>datesDTOS);
}
