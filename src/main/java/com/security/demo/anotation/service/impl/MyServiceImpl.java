package com.security.demo.anotation.service.impl;

import com.security.demo.anotation.service.MyService;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    public String helloFromService(){
        return "hello from service class";
    }
}
