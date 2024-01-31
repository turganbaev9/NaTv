package kg.mega.na_tv.repository;

import kg.mega.na_tv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRep extends JpaRepository<User,Long> {

}