package com.FoodDelivery.Delivery.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "role")
@Data
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public UserRole() {

    }

    public UserRole(String name) {
        super();
        this.name = name;
    }

}
