package com.FoodDelivery.Delivery.services;

import com.FoodDelivery.Delivery.models.User;

import java.util.Collection;

public interface UserService {

    User saveUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    Collection<User> getAllUsers();

}
