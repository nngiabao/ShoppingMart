package com.shoppingweb.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue
    private int id;
    //
    @Column(name = "name")
    private String name;

}
