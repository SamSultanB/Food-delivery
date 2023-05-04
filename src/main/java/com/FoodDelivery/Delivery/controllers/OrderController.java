package com.FoodDelivery.Delivery.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delicious-foods")
@Api(description = "Order endpoints")
public class OrderController {

    @GetMapping
    @ApiOperation("Main page of site")
    public String mainPage(){
        return "This is delivery";
    }

}
