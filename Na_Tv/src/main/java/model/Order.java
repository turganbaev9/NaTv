package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import model.Enum.Status;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_order")
@RequiredArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @JsonProperty("created_date")
    Date createdDate;
    @JsonProperty("client_email")
    String clientEmail;
    @JsonProperty("full_name_client")
    String fullNameClient;
    @JsonProperty("client_phone")
    String clientPhone;
    Double totalSum;
    @Enumerated(EnumType.STRING)
    Status status;
    Double priceBeforeDiscount;
    Double priceWithDiscount;
    @ManyToOne
    @JoinColumn(name = "channel_id")
    Channel channel;
    @JoinColumn(name = "text_id")
    @ManyToOne
    Text text;
    @ManyToOne
    @JoinColumn(name = "price_id")
    Price price;
}
