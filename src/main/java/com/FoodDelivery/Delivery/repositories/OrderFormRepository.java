package com.FoodDelivery.Delivery.repositories;

import com.FoodDelivery.Delivery.models.OrderForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderFormRepository extends JpaRepository<OrderForm, Long> {
}
