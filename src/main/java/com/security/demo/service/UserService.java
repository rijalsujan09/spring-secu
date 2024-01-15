package com.security.demo.service;

import com.security.demo.config.JwtService;
import com.security.demo.entity.Role;
import com.security.demo.entity.User;
import com.security.demo.repository.UserRepository;
import com.security.demo.response.AuthRequest;
import com.security.demo.response.AuthResponse;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    @Autowired
    private final AuthenticationManager authenticationManager;

    public AuthResponse createUser(User user){
        User user1 = User.builder()
                .username(user.getUsername())
                .password(passwordEncoder.encode(user.getPassword())).build();
        this.repository.save(user1) ;
        UserDetails userReturn = org.springframework.security.core.userdetails.User
                .withUsername(user1.getUsername())
                .password(user1.getPassword())
                .authorities("ADMIN")
                .build();
        String jwtToken  = jwtService.generateToken(userReturn);
        return  new AuthResponse(jwtToken);
    }


    public AuthResponse authenticate(AuthRequest request){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );
        var user = this.repository.findByUsername(request.getUsername());
        UserDetails userReturn = org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password(user.getPassword())
                .authorities("ADMIN")
                .build();
        String jwtToken  = jwtService.generateToken(userReturn);
        return  new AuthResponse(jwtToken);
    }


    public List<User> getAllUser(){
       return  this.repository.findAll();
    }
}
