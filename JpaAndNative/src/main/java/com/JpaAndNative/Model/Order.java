package com.JpaAndNative.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Data
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private String productName;
    private Integer price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    @JsonBackReference
    private User user;


}
