package com.shoppingweb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class OrderItem {
    @Id
    @GeneratedValue
    int id;
    //
    @Column(name="order_id")
    int order_id;
    //
    @Column(name = "product_id")
    int product_id;
    //
    @Column(name = "quantity")
    int quantity;
    //
    @Column(name = "price")
    int price;
    //
     //
}
