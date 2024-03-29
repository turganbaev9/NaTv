package kg.mega.na_tv.repository;

import kg.mega.na_tv.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRep extends JpaRepository<Order,Long> {
    @Query("SELECT o FROM Order o WHERE " +
            "LOWER(TO_CHAR(o.createdDate, 'YYYY-MM-DD HH24:MI:SS')) LIKE LOWER(CONCAT('%', :searchQuery, '%')) OR " +
            "LOWER(o.fullNameClient) LIKE LOWER(CONCAT('%', :searchQuery, '%')) OR " +
            "LOWER(o.clientEmail) LIKE LOWER(CONCAT('%', :searchQuery, '%')) OR " +
            "LOWER(o.clientPhone) LIKE LOWER(CONCAT('%', :searchQuery, '%'))")
    List<Order> findByCreatedDateContainingOrFullNameClientContainingOrClientEmailContainingOrClientPhoneContaining(@Param("searchQuery") String searchQuery);


}
