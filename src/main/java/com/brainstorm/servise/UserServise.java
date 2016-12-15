package com.brainstorm.servise;

import com.brainstorm.entity.User;

import java.util.List;


public interface UserServise {
    //Find all user
    List<User> findAll();

    //Safe new user
    User saveAndFlush(User user);
}
