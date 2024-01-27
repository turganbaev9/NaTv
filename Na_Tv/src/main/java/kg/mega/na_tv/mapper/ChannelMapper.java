package kg.mega.na_tv.mapper;

import model.Channel;
import model.dto.ChannelDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ChannelMapper {
    ChannelMapper INSTANCE= Mappers.getMapper(ChannelMapper.class);
    ChannelDTO toDTO(Channel channel);
    Channel toEntity(ChannelDTO channelDTO);
    List<ChannelDTO> toDTOList(List<Channel>channelList);
    List<Channel>toEntityList(List<ChannelDTO>channels);

}
