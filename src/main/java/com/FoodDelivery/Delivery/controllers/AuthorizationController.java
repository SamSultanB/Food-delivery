package com.FoodDelivery.Delivery.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authorization")
@Api(description = "Authorization endpoints")
public class AuthorizationController {

    @GetMapping
    @ApiOperation("Authorization page")
    public String authorization(){
        return "Authorization page";
    }

}
