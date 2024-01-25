package kg.mega.na_tv.service.Impl;

import kg.mega.na_tv.service.OrderService;
import lombok.RequiredArgsConstructor;
import model.Order;
import model.dto.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderDTO save(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public List<Order> searchOrders(String searchQuery) {
        return null;
    }
}
