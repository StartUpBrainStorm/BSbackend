package com.brainstorm.dao;

import com.brainstorm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    //Get list of all user from DB
    @Override
    List<User> findAll();


}
