package com.project.user.service.service;

import com.project.user.service.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUser();
    User getUser(String userId);

}
