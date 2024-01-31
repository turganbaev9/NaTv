package kg.mega.na_tv.service.Impl;

import kg.mega.na_tv.repository.TextRep;
import kg.mega.na_tv.service.TextService;
import lombok.RequiredArgsConstructor;
import kg.mega.na_tv.model.Text;
import kg.mega.na_tv.model.dto.TextDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TextServiceImpl implements TextService {
    private  final TextRep textRep;
    @Override
    public TextDTO save(TextDTO textDTO) {
        return null;
    }

    @Override
    public List<Text> findAll() {
        return textRep.findAll();
    }
}
