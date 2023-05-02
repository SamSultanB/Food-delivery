package com.FoodDelivery.Delivery.models;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
public class OrderForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "address")
    private String address;
    @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name = "orders_id", referencedColumnName = "id")
    private Collection<FoodModel> foods;
    @Column(name = "status")
    private Boolean accepted;

    public OrderForm(){

    }

    public OrderForm(String address, Collection<FoodModel> foods){
        this.address = address;
        this.foods = foods;
    }
}
