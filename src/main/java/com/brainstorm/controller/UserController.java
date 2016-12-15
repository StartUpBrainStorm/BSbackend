package com.brainstorm.controller;

import com.brainstorm.entity.User;
import com.brainstorm.servise.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class UserController {

    //Get Object from UserService
    @Autowired
    UserServise userServise;


    //Get index page with list of user fro DB
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String getIndexPage(Model model) {

        //Geting all user
        List<User> allUsers = userServise.findAll();

        //Set all user for Index Page
        model.addAttribute("users", allUsers);

        return "index";
    }


}
