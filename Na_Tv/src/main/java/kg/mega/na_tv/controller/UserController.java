package kg.mega.na_tv.controller;

import kg.mega.na_tv.service.UserService;
import lombok.RequiredArgsConstructor;
import kg.mega.na_tv.model.dto.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Api(tags = USER)
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private  final UserService userService;
    @PostMapping("/save")
  //  @ApiOperation(value = "Сохранение пользователя")
    UserDTO save(@RequestBody UserDTO userDTO){
        return userService.save(userDTO);
    }
}