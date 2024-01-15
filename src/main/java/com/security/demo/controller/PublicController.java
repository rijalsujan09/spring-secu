package com.security.demo.controller;

import com.security.demo.response.AuthRequest;
import com.security.demo.response.AuthResponse;
import com.security.demo.service.UserService;
import com.security.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/public")
public class PublicController {

    @Autowired
    private  UserService userService;

    @PostMapping("/create")
    public ResponseEntity<AuthResponse> createUser(@RequestBody User user){
        AuthResponse rep = this.userService.createUser(user);
        return  new ResponseEntity<>(rep , HttpStatus.OK);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthResponse> authenticate(@RequestBody AuthRequest authRequest){
        AuthResponse rep = this.userService.authenticate(authRequest);
        return  new ResponseEntity<>(rep , HttpStatus.OK);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return  new ResponseEntity<>("Hello  From Server", HttpStatus.OK);
    }

    @GetMapping("/bye")
    public ResponseEntity<String> sayBye(){
        return  new ResponseEntity<>("Bye! see you again", HttpStatus.OK);
    }

}
