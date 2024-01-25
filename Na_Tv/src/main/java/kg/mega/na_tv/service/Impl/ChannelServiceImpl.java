package kg.mega.na_tv.service.Impl;

import kg.mega.na_tv.service.ChannelService;
import lombok.RequiredArgsConstructor;
import model.dto.ChannelDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class ChannelServiceImpl implements ChannelService {
    @Override
    public ChannelDTO save(ChannelDTO channelDTO) {
        return null;
    }

    @Override
    public ChannelDTO findBYId(Long id) {
        return null;
    }

    @Override
    public List<ChannelDTO> findAll() {
        return null;
    }
}
