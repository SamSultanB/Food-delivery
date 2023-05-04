package com.FoodDelivery.Delivery.controllers;

import com.FoodDelivery.Delivery.models.FoodModel;
import com.FoodDelivery.Delivery.models.OrderForm;
import com.FoodDelivery.Delivery.services.FoodService;
import com.FoodDelivery.Delivery.services.OrderFormService;
import com.FoodDelivery.Delivery.services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Collection;

@RestController
@RequestMapping("/delicious-foods")
@Api(description = "Order endpoints")
public class OrderController {

    private FoodService foodService;
    private OrderFormService orderFormService;
    private UserService userService;

    public OrderController(FoodService foodService, OrderFormService orderFormService, UserService userService){
        this.foodService = foodService;
        this.orderFormService = orderFormService;
        this.userService = userService;
    }

    @GetMapping
    @ApiOperation("Main page of site")
    public ResponseEntity<Collection<FoodModel>> mainPage(){
        return ResponseEntity.ok(foodService.getAllFoods());
    }

    @GetMapping("/{id}")
    @ApiOperation("Gets exact food by id")
    public ResponseEntity<FoodModel> getFood(@PathVariable("id") Long id){
        return ResponseEntity.ok(foodService.getFoodById(id));
    }

    @PostMapping("/order")
    @ApiOperation("Here user fills order form")
    public ResponseEntity<String> makeOrder(Principal principal, @RequestBody OrderForm orderForm){
        userService.findByEmail(principal.getName()).getOrderForms().add(orderForm);
        return ResponseEntity.ok("Your order is accepted!");
    }

}
