package com.security.demo.config;

import com.security.demo.entity.Role;
import com.security.demo.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PrincipleUser implements UserDetails {
    private final User user;

    public PrincipleUser(User user) {
        super();
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//      List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
//      for (Role role : user.getRoles()){
//          SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.name());
//          grantedAuthorities.add(authority);
//      }
//        return user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.name())).collect(Collectors.toList());
        return List.of(new SimpleGrantedAuthority("ADMIN"));
    }


    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getPassword();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
