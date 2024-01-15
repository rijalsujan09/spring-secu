package com.security.demo.anotation.service.impl;

import com.security.demo.anotation.model.User;
import com.security.demo.anotation.model.UserDto;

public interface UserService {
    public User getUser(UserDto userdto);
}
