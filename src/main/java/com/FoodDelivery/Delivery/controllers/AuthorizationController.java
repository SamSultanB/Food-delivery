package com.FoodDelivery.Delivery.controllers;

import com.FoodDelivery.Delivery.models.User;
import com.FoodDelivery.Delivery.services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@Api(description = "Authorization endpoints")
public class AuthorizationController {

    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    public AuthorizationController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    @ApiOperation("Main page")
    public ResponseEntity<String> authorization(){
        return ResponseEntity.ok("Login! If you are not registered yet, go to registration page!");
    }

    @PostMapping("/registration")
    @ApiOperation("User registration endpoint")
    public ResponseEntity<String> registration(@RequestBody User user){
        userService.saveUser(user);
        return ResponseEntity.ok("You are registered successfully");
    }

    @PostMapping("/login")
    @ApiOperation("User login endpoint")
    public ResponseEntity<String> login(@RequestBody User user){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                user.getEmail(), user.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return ResponseEntity.ok("You signed in successfully!");
    }

}
