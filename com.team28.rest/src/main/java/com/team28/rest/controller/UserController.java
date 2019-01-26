package com.team28.rest.controller;

import com.team28.rest.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/user")
    public User user(@RequestParam(value = "id") long id) {
        // Fetch db for User
        List<Long> interests = new ArrayList<Long>();
        interests.add(1L);
        interests.add(2L);
        return new User(id, "name", "email@email.com", interests);
    }
}
