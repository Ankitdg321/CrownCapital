package com.anweb.Finance.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import com.anweb.Finance.loan.jwtsecurity.JwtHelper;
import com.anweb.Finance.loan.model.JwtRequest;
import com.anweb.Finance.loan.model.JwtResponse;
import com.anweb.Finance.loan.model.User;
import com.anweb.Finance.loan.repo.UserRepository;
import com.anweb.Finance.loan.serviceImpl.UserService;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtHelper helper;

    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest jwtRequest) {

        // Authenticate the user using the provided credentials
        this.doAuthenticate(jwtRequest.getEmail(), jwtRequest.getPassword());

        // Load user details after successful authentication
        UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getEmail());

        // Generate JWT token
        String token = this.helper.generateToken(userDetails.getUsername());

        // Create response with the token and user details
        JwtResponse response = new JwtResponse.Builder()
                .jwtToken(token)
                .user(userDetails.getUsername())
                .build();


        // Return response entity
        return ResponseEntity.ok(response);
    }


    // Authentication logic
    private void doAuthenticate(String username, String password) {
        try {
            UsernamePasswordAuthenticationToken authenticationToken =
                    new UsernamePasswordAuthenticationToken(username, password);
            authenticationManager.authenticate(authenticationToken);
        } catch (Exception e) {
            throw new RuntimeException("Invalid username or password");
        }
    }
    
    @PostMapping(value = "/create-user")
    public User createUser(@RequestBody User user) {
    	
    	return userService.createUser(user);
    	
    }
    
    
    
    
}
