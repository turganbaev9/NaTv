package kg.mega.na_tv.controller;

import kg.mega.na_tv.service.OrderDatesService;
import lombok.RequiredArgsConstructor;
import model.dto.OrderDatesDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/orderDates")
public class OrderDatesController {
    private  final OrderDatesService orderDatesService;
    @PostMapping("/save")
    public OrderDatesDTO save(@RequestBody OrderDatesDTO orderDatesDTO){
        return orderDatesService.save(orderDatesDTO);
    }
}
