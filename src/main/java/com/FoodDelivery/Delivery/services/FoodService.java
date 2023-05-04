package com.FoodDelivery.Delivery.services;

import com.FoodDelivery.Delivery.models.FoodModel;

import java.util.Collection;

public interface FoodService {

    void saveFood(FoodModel foodModel);

    Collection<FoodModel> getAllFoods();

    FoodModel getFoodById(Long id);

    void deleteFoodById(Long id);

}
