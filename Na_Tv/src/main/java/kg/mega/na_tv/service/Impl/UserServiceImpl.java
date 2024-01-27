package kg.mega.na_tv.service.Impl;

import kg.mega.na_tv.service.UserService;
import lombok.RequiredArgsConstructor;
import model.User;
import model.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public UserDTO save(UserDTO userDTO) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
