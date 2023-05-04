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
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name = "orders_id", referencedColumnName = "id")
    private Collection<FoodModel> foods;
    @Column(name = "status")
    private Boolean accepted = false;
    @Column(name = "delivered")
    private Boolean delivered = false;

    public OrderForm(){

    }

    public OrderForm(String address, String phoneNumber, Collection<FoodModel> foods){
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.foods = foods;
    }
}
