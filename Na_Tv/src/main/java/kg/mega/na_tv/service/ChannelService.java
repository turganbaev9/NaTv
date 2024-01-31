package kg.mega.na_tv.service;

import kg.mega.na_tv.model.dto.ChannelDTO;

import java.util.List;

public interface ChannelService {
    ChannelDTO save(ChannelDTO channelDTO);
    ChannelDTO findById(Long id);
    List<ChannelDTO> findAll();
}
