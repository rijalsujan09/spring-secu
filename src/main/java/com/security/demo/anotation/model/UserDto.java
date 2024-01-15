package com.security.demo.anotation.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserDto {
    private String name;
    private String email;
    private String password;
}
