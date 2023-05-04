package com.FoodDelivery.Delivery.services.serviceImpl;

import com.FoodDelivery.Delivery.models.FoodModel;
import com.FoodDelivery.Delivery.repositories.FoodRepository;
import com.FoodDelivery.Delivery.services.FoodService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FoodServiceImpl implements FoodService {

    private FoodRepository foodRepository;

    public FoodServiceImpl(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

    @Override
    public void saveFood(FoodModel foodModel) {
        foodRepository.save(foodModel);
    }

    @Override
    public Collection<FoodModel> getAllFoods() {
        return foodRepository.findAll();
    }

    @Override
    public FoodModel getFoodById(Long id) {
        return foodRepository.getReferenceById(id);
    }

    @Override
    public void deleteFoodById(Long id) {
        foodRepository.deleteById(id);
    }
}
