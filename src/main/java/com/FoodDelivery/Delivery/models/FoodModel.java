package com.FoodDelivery.Delivery.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "food")
public class FoodModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private Integer price;

    public FoodModel(){

    }

    public FoodModel(String name, String description, Integer price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

}
