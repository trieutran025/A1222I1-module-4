package com.example.validation_user.service;

import com.example.validation_user.entity.User;

import java.util.List;

public interface UserService {
    void create(User user);
    List<User> findAll();
}
