package com.JpaAndNative.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "user")
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer userId;
    private String userName;
    private String userAddress;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Order> orderList=new ArrayList<>();


}
