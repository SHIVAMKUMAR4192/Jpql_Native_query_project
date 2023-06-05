package com.JpaAndNative.Repository;

import com.JpaAndNative.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
//    @Query(value = "select * from user where name like %?!% ",nativeQuery = true)
//    List<User> findUser(String name);
//    List<User> findUserByUserAddress(String userAdress);
}
