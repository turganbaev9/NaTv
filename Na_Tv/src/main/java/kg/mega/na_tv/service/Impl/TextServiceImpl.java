package kg.mega.na_tv.service.Impl;

import kg.mega.na_tv.service.TextService;
import lombok.RequiredArgsConstructor;
import model.Text;
import model.dto.TextDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TextServiceImpl implements TextService {
    @Override
    public TextDTO save(TextDTO textDTO) {
        return null;
    }

    @Override
    public List<Text> findAll() {
        return null;
    }
}