package com.example.smartex.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.smartex.model.User;

@Service
public class UserService {
    //1.create user
    //2.get a user
    //3. get all users

    private final Map<String, User> users = new HashMap<>();

    public User createUser(String userId, String name, double balance){
        User user = new User(userId, name, balance);
        users.put(userId, user);
        return user;
    }

    public User getUser(String userId){
        return users.get(userId);
    }

    public List<User> getAllUsers(){
        return new ArrayList<>(users.values());
    }

}
