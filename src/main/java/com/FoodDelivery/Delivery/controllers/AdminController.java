package com.FoodDelivery.Delivery.controllers;

import com.FoodDelivery.Delivery.services.OrderFormService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@Api(description = "Endpoints for admin")
public class AdminController {

    private OrderFormService orderFormService;
    public AdminController(OrderFormService orderFormService){
        this.orderFormService = orderFormService;
    }


    @GetMapping
    @ApiOperation("Admin home page endpoint")
    public String home(){
        return "Admin page";
    }

}
