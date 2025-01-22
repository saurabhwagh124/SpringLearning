package com.saurabh.SpringSec1.service;

import com.saurabh.SpringSec1.model.Users;
import com.saurabh.SpringSec1.repo.UserRepo;
import com.saurabh.SpringSec1.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepo.findByUsername(username);
        if(user == null){
            System.out.println("404: User not found");
        throw new UsernameNotFoundException("USER NOT FOUND");
        }
        return new UserPrincipal(user);
    }

}
