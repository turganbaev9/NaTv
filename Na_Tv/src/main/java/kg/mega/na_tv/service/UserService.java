package kg.mega.na_tv.service;

import model.User;
import model.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO save(UserDTO userDTO);
    List<User> findAll();
}
