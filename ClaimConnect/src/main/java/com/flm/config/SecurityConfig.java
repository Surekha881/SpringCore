package com.flm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // disable CSRF for APIs
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/patient/signup").permitAll()
                .requestMatchers("/api/hospital/register").permitAll()
                .requestMatchers("/api/insurance/register").permitAll()
                .requestMatchers("/api/insurance/**").permitAll()// allow signup
                .anyRequest().authenticated() // everything else requires login
            )
            .httpBasic(Customizer.withDefaults()); // basic auth for testing in Postman
        return http.build();
    }
    
}
