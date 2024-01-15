package com.security.demo.anotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String helloFromRepo(){
        return "hello  from repository";
    }
}
