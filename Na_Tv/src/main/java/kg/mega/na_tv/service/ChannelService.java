package kg.mega.na_tv.service;

import model.dto.ChannelDTO;

import java.util.List;

public interface ChannelService {
    ChannelDTO save(ChannelDTO channelDTO);
    ChannelDTO findBYId(Long id);
    List<ChannelDTO> findAll();
}
