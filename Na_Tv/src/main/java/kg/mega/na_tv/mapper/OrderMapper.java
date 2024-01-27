package kg.mega.na_tv.mapper;

import model.Order;
import model.dto.OrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE= Mappers.getMapper(OrderMapper.class);
    OrderDTO toDTO(Order order);
    Order toEntity(OrderDTO orderDTO);
    List<OrderDTO> toDtoList(List<Order>orders );
    List<Order>toEntityList(List<OrderDTO>ordersDtos);
}
