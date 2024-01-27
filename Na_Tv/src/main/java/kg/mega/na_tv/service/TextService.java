package kg.mega.na_tv.service;

import model.Text;
import model.dto.TextDTO;

import java.util.List;

public interface TextService {
    TextDTO save(TextDTO textDTO);
    List<Text> findAll();
}
