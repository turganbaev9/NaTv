package kg.mega.na_tv.controller;

import kg.mega.na_tv.service.ChannelService;
import lombok.RequiredArgsConstructor;
import model.dto.ChannelDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/channel")
@RequiredArgsConstructor
public class ChannelController {
private final ChannelService service;
    @PostMapping("/saveChannel")
    public ChannelDTO save(@RequestBody ChannelDTO channelDTO){
        return service.save(channelDTO);
    }
    @GetMapping("/findAll")
    public List<ChannelDTO> findAll(){
        return service.findAll();
    }
    @GetMapping("/findById")
    public ChannelDTO findById(Long id){
        ChannelDTO channelDTO=service.findById(id);
        return channelDTO;
    }

}
