package com.FoodDelivery.Delivery.services.serviceImpl;

import com.FoodDelivery.Delivery.models.FoodModel;
import com.FoodDelivery.Delivery.services.FoodService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FoodServiceImpl implements FoodService {
    @Override
    public FoodModel saveFood(FoodModel foodModel) {
        return null;
    }

    @Override
    public Collection<FoodModel> getAllFoods() {
        return null;
    }

    @Override
    public FoodModel getFoodById(Long id) {
        return null;
    }

    @Override
    public void deleteFoodById(Long id) {

    }
}
