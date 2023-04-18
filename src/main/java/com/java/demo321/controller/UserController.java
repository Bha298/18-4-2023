package com.java.demo321.controller;

import com.java.demo321.model.User;
import com.java.demo321.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    private User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping("/")
    private List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("/{id}")
    private User findById(@PathVariable("id")Long userId){
        return userService.findById(userId);
    }

    @PutMapping("/{id}")
    private  User updateId(@PathVariable("id") Long userId,@RequestBody User user){
        return userService.updateId(userId,user);
    }

    @DeleteMapping("/{id}")
    private String delete(@PathVariable("id")Long userId){
    userService.delete(userId);
    return"successfully deleted";
    }
}
