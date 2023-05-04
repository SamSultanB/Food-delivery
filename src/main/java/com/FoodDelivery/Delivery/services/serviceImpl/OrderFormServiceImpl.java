package com.FoodDelivery.Delivery.services.serviceImpl;

import com.FoodDelivery.Delivery.models.OrderForm;
import com.FoodDelivery.Delivery.repositories.OrderFormRepository;
import com.FoodDelivery.Delivery.services.OrderFormService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class OrderFormServiceImpl implements OrderFormService {

    private OrderFormRepository orderFormRepository;

    public OrderFormServiceImpl(OrderFormRepository orderFormRepository){
        this.orderFormRepository = orderFormRepository;
    }

    @Override
    public void save(OrderForm orderForm) {
        orderFormRepository.save(orderForm);
    }

    @Override
    public void delete(Long id) {
        orderFormRepository.deleteById(id);
    }

    @Override
    public OrderForm getOrderById(Long id) {
        return orderFormRepository.getReferenceById(id);
    }

    @Override
    public Collection<OrderForm> getAllOrders() {
        return orderFormRepository.findAll();
    }
}
