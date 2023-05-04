package com.FoodDelivery.Delivery.services.serviceImpl;

import com.FoodDelivery.Delivery.models.User;
import com.FoodDelivery.Delivery.repositories.UserRepository;
import com.FoodDelivery.Delivery.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public Collection<User> getAllUsers() {
        return userRepository.findAll();
    }
}
