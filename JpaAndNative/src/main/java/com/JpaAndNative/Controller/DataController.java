package com.JpaAndNative.Controller;

import com.JpaAndNative.Model.Order;
import com.JpaAndNative.Model.User;
import com.JpaAndNative.Repository.OrderRepository;
import com.JpaAndNative.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/order")
public class DataController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;
    @PostMapping("/saveOrderDetails")
    public List<Order> saveOrderDetails(@RequestBody List<Order> orders) {
        return orderRepository.saveAll(orders);
    }

    @PostMapping("/saveUserDetails")
        public List<User> saveUserDetails(@RequestBody List<User> users) {
        return userRepository.saveAll(users);
    }

    @GetMapping("/findUserByProductName")
    public List<Order> findUserByProductName( Order order)
    {
        return (List<Order>) orderRepository.findByProductName(order);
//        return orderRepository.getProductName(findUserByProductName(order));
    }
//    @GetMapping("/findUserByUserName")
//    public User findUserByUserName(User user)
//    {
//        return (User) userRepository.findUser(user.getUserName());
//    }
}
