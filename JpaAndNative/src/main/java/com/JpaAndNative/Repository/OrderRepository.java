package com.JpaAndNative.Repository;

import com.JpaAndNative.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

    @Query(value = "select o.productName from order o",nativeQuery = true)
    Order findByProductName(Order productName);
//    @Query(value = "select * from orders where price >?1",nativeQuery = true)
//    List<Order> getUsers(List<Order> price);
}
