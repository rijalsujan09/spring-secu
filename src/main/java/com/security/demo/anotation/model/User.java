package com.security.demo.anotation.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User{
    private String name;
    private String email;
    private String password;
}
