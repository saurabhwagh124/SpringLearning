package com.saurabh.SpringSec1.service;
import com.saurabh.SpringSec1.model.Users;
import com.saurabh.SpringSec1.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(11);

    public Users saveUser(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println("new password  " + user.getPassword());
        userRepo.save(user);
        return user;
    }
}
