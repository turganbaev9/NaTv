package kg.mega.na_tv.service;

import model.Order;
import model.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    OrderDTO save(OrderDTO orderDTO);

    List<Order> findAll();
    //List<Date> getAvailableDate(;)
    List<Order> searchOrders(String searchQuery);

}
