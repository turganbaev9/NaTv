package model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import model.Enum.Status;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
@Data
public class OrderDTO {
    Long id;
    @JsonProperty("created_date")
    Date createdDate;
    @JsonProperty("client_email")
    String clientEmail;
    @JsonProperty("full_name_client")
    String fullNameClient;
    @JsonProperty("client_phone")
    String clientPhone;
    @JsonProperty("order_sum")
    Double priceBeforeDiscount;
    Double priceWithDiscount;
    Double totalSum;
    @Enumerated(EnumType.STRING)
    Status status;

    @JoinColumn(name = "channel_id")
    ChannelDTO channel;
    @JoinColumn(name = "text_id")
    TextDTO text;
    @JoinColumn(name = "price_id")
    PriceDTO price;
}
