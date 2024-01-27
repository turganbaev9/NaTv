package kg.mega.na_tv.mapper;

import model.Text;
import model.dto.TextDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface TextMapper {

        TextMapper INSTANCE= Mappers.getMapper(TextMapper.class);
        TextDTO toDTO(Text text);
        Text toEntity(TextDTO textDTO);
        List<TextDTO> toDTOList(List<Text>texts);
        List<Text>toEntityList(List<TextDTO>textDTOS);


}

