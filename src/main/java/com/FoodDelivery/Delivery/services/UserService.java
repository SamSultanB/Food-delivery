package com.FoodDelivery.Delivery.services;

import com.FoodDelivery.Delivery.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Collection;

public interface UserService extends UserDetailsService {

    void saveUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    Collection<User> getAllUsers();

}
