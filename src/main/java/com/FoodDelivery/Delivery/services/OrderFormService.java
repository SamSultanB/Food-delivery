package com.FoodDelivery.Delivery.services;

import com.FoodDelivery.Delivery.models.OrderForm;

import java.util.Collection;

public interface OrderFormService {

    void save(OrderForm orderForm);

    void delete(Long id);

    OrderForm getOrderById(Long id);

    Collection<OrderForm> getAllOrders();

}
