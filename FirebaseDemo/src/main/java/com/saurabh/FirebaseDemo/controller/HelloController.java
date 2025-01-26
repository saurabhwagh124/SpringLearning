package com.saurabh.FirebaseDemo.controller;
import com.saurabh.FirebaseDemo.config.FirebaseAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        Authentication username = SecurityContextHolder.getContext().getAuthentication();

        return "Hello "+ username.getPrincipal().toString();
    }
}
