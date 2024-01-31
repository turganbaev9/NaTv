package kg.mega.na_tv.service.Impl;

import ch.qos.logback.classic.Logger;
import kg.mega.na_tv.mapper.UserMapper;
import kg.mega.na_tv.repository.UserRep;
import kg.mega.na_tv.service.UserService;
import lombok.RequiredArgsConstructor;
import kg.mega.na_tv.model.User;
import kg.mega.na_tv.model.dto.UserDTO;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    Logger log= (Logger) LoggerFactory.getLogger(UserServiceImpl.class);
    private  final UserRep userRep;
    @Override
    public UserDTO save(UserDTO userDTO) {
        User user= UserMapper.INSTANCE.toEntity(userDTO);
        log.info("trying to save user {}",user);
        //car.setPhoto(!fileDownload(file).equals("") ? fileDownload(file) : "file not saved");
        userRep.save(user);
        return UserMapper.INSTANCE.toDTO(user);
    }

    @Override
    public List<User> findAll() {
        return userRep.findAll();
    }

    private String fileDownload(MultipartFile file){
        try {
            File path=new File("D:\\image\\carsImages\\"+file.getOriginalFilename());
            path.createNewFile();
            FileOutputStream output=new FileOutputStream(path);
            output.write(file.getBytes());
            output.close();


            return path.getAbsolutePath();
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
