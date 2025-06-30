package com.shoppingweb.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private Double price;
    @Column(name = "image_url")
    String imageUrl;
    @Column(name = "category_id")
    int categoryId;
    @Column(name = "stock_quantity")
    int stockQuantity;
    @Column(name = "created_at")
    String createdAt;
    @Column(name = "updated_at")
    String  updatedAt;
    @Column(name = "is_active")
    boolean isActive;
}
