package com.FoodDelivery.Delivery.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<UserRole> role;

    @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    Collection<OrderForm> orderForms;

    public User(){

    }

    public User(String name, String email, String password, Collection<UserRole> role){
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

}
