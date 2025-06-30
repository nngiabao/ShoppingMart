package com.shoppingweb.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cart_item")
public class CartItem {
    @Id
    @GeneratedValue
    int id;
    @Column(name="user_id")
    int user_id;
    @Column(name="product_id")
    int product_id;
    @Column(name="quantity")
    int quantity;

}
