package kg.mega.na_tv.service.Impl;

import kg.mega.na_tv.mapper.ChannelMapper;
import kg.mega.na_tv.repository.ChannelRep;
import kg.mega.na_tv.service.ChannelService;
import lombok.RequiredArgsConstructor;
import model.Channel;
import model.dto.ChannelDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class ChannelServiceImpl implements ChannelService {
    private final ChannelRep channelRep;


    @Override
    public ChannelDTO save(ChannelDTO channelDTO) {
        Channel channel= ChannelMapper.INSTANCE.toEntity(channelDTO);
        channelRep.save(channel);
        return ChannelMapper.INSTANCE.toDTO(channel);
    }

    @Override
    public ChannelDTO findBYId(Long id) {
        return ChannelMapper.INSTANCE.toDTO(channelRep.findById(id).get());
    }

    @Override
    public List<ChannelDTO> findAll() {
        List<Channel>channels=channelRep.findAll();

        return ChannelMapper.INSTANCE.toDTOList(channels);
    }
}
