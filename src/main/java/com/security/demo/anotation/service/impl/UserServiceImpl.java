package com.security.demo.anotation.service.impl;

import com.security.demo.anotation.model.User;
import com.security.demo.anotation.model.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{

    private  final  ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(ModelMapper modelMapper){
        this.modelMapper= modelMapper;
    }

    @Override
    public User getUser(UserDto userdto) {
        return modelMapper.map(userdto, User.class);
    }


}
