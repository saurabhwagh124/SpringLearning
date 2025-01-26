package com.saurabh.FirebaseDemo.security;

import com.saurabh.FirebaseDemo.config.FirebaseAuthFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final FirebaseAuthFilter firebaseAuthFilter;

    public SecurityConfig(FirebaseAuthFilter firebaseAuthFilter) {
        this.firebaseAuthFilter = firebaseAuthFilter;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable()) // Disabling CSRF for API endpoints (consider enabling if needed)
                .addFilterBefore(firebaseAuthFilter, UsernamePasswordAuthenticationFilter.class) // Add FirebaseAuthFilter before default filter
                .authorizeHttpRequests(request -> request
                        .requestMatchers("/public/**", "/login", "/register").permitAll() // Public URLs for login or registration
                        .anyRequest().authenticated() // All other requests require authentication
                );
        return http.build();
    }
}
