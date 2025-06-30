package com.shoppingweb.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Orders {
    @Id
    @GeneratedValue
    int id;
    //
    @Column(name = "user_id")
    int user_id;
    //
    @Column(name = "order_date")
    String order_date;
    @Column(name = "total")
    double total;
}
