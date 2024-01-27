package kg.mega.na_tv.repository;

import model.OrderDates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDatesRep extends JpaRepository<OrderDates,Long> {
}
