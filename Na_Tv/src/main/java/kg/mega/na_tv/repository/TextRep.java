package kg.mega.na_tv.repository;

import model.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRep extends JpaRepository<Text,Long> {
}
