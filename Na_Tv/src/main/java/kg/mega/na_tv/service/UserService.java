package kg.mega.na_tv.service;

import kg.mega.na_tv.model.User;
import kg.mega.na_tv.model.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO save(UserDTO userDTO);
    List<User> findAll();
}
