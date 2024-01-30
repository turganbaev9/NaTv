package kg.mega.na_tv.controller;

import kg.mega.na_tv.service.DiscountService;
import lombok.RequiredArgsConstructor;
import model.Discount;
import model.dto.DiscountDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/discount")
@RequiredArgsConstructor
public class DiscountController {
    private final DiscountService service;
    @PostMapping("/saveDiscount")
    public DiscountDTO save(@RequestBody DiscountDTO discountDTO){
       return service.save(discountDTO);
    }
    @GetMapping("/findAll")
    public List<Discount>findAll(){
        return service.findAll();
    }
}
