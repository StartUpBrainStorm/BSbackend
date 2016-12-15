package com.brainstorm.controller;

import com.brainstorm.entity.User;
import com.brainstorm.servise.UserServise;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegController {

    @Autowired
    UserServise userServise;

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    String getNewUser(@RequestParam(value = "userFirstName") String userFirstName,
                      @RequestParam(value = "userLastName") String userLastName,
                      @RequestParam(value = "userAge") int userAge,
                      @RequestParam(value = "userEmail") String userEmail,
                      @RequestParam(value = "userPassword") String userPassword) {

        User newUser = new User();
        newUser.setUserFirstName(userFirstName);
        newUser.setUserLastName(userLastName);
        newUser.setUserAge(userAge);
        newUser.setUserEmail(userEmail);
        //hash password with bcrypt and salt 10
        String hashed = BCrypt.hashpw(userPassword, BCrypt.gensalt(10));
        //Check hashed password
        //BCrypt.checkpw(enteredPassword, passwordFromDataBase);
        newUser.setUserPassword(hashed);

        //save new user in DB
        userServise.saveAndFlush(newUser);

        return "redirect:/";
    }
}
