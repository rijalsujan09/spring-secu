package com.security.demo.anotation.propertysource;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class PropertySourceDemo {

    @Autowired
    private Environment environment;

    @Value("${mail.host}")
    private String host;
    @Value("${mail.email}")
    private String email;
    @Value("${mail.password}")
    private String password;

    @Value("${app.name}")
    private String appName;
    @Value("${app.description}")
    private String description;


    public void getEnvironmentValues(){
        System.out.println(environment.getProperty("mail.host"));
        System.out.println(environment.getProperty("mail.email"));
    }


}
