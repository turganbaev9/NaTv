package kg.mega.na_tv.repository;

import kg.mega.na_tv.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRep extends JpaRepository<Discount,Long> {
/*   @Query(value = "select *from tb_discount where channel_id=:id" +
           "order by discount_days desc ",nativeQuery = true)
    List<Discount> getDiscounts(Long id);*/

}
