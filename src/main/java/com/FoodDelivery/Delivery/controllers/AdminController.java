package com.FoodDelivery.Delivery.controllers;

import com.FoodDelivery.Delivery.models.OrderForm;
import com.FoodDelivery.Delivery.services.OrderFormService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@Api(description = "Endpoints for admin")
public class AdminController {

    private OrderFormService orderFormService;

    public AdminController(OrderFormService orderFormService){
        this.orderFormService = orderFormService;
    }


    @GetMapping
    @ApiOperation("Here admin sees all orders")
    public String home(){
        return "Admin page";
    }

    @GetMapping("/{id}")
    @ApiOperation("Admin gets exact orderForm")
    public ResponseEntity<OrderForm> getOrder(@PathVariable("id") Long id){
        return ResponseEntity.ok(orderFormService.getOrderById(id));
    }

    @PostMapping("/{id}")
    @ApiOperation("Admin accepts the order")
    public ResponseEntity<String> accepteOrder(@PathVariable("id") Long id, @RequestBody Boolean accepted){
        orderFormService.getOrderById(id).setAccepted(accepted);
        return ResponseEntity.ok("The order is accepted!");
    }

}
