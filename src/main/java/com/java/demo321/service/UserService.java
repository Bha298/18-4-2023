package com.java.demo321.service;

import com.java.demo321.model.User;
import com.java.demo321.rep.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRep userRep;
    public User saveUser(User user) {
        return userRep.save(user);
    }

    public List<User> findAll() {
        return userRep.findAll();
    }

    public User findById(Long userId) {
        return userRep.findById(userId).get();
    }

    public User updateId(Long userId, User user) {

        User user1=userRep.findById(userId).get();
        user1.setUserName(user.getUserName());
        user1.setUserEmail(user.getUserEmail());
        return userRep.save(user1);

    }

    public void delete(Long userId) {
        userRep.deleteById(userId);
    }
}
