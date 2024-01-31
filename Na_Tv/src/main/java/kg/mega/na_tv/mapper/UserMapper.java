package kg.mega.na_tv.mapper;

import kg.mega.na_tv.model.User;
import kg.mega.na_tv.model.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
    List<UserDTO> toDTOList(List<User> userList);
    List<User>toEntityList(List<UserDTO> userDTOList);
}

