package kg.mega.na_tv.repository;

import kg.mega.na_tv.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRep extends JpaRepository<Channel,Long> {
 /*   @Query(value = "select * from tb_channel" +
            "where channel_status=true" +
            "order by channel_name asc", nativeQuery = true)
    List<Channel> findAllByActive();

    @Query(value = "select channel_status from tb_channel"+
            "where id =:id ",nativeQuery = true)
    boolean findByActive(Long id);*/
}
