package kg.mega.na_tv.service;

import kg.mega.na_tv.model.Text;
import kg.mega.na_tv.model.dto.TextDTO;

import java.util.List;

public interface TextService {
    TextDTO save(TextDTO textDTO);
    List<Text> findAll();
}
