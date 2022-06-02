package com.ranyewu.demoblog.dao;

import com.ranyewu.demoblog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;


//内含增删改查等功能，可以直接实现
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);

}
