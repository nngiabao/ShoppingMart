package com.shoppingweb.DAO;

import com.shoppingweb.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product,Long> {
    public Product findById(int id);
    //public List<Product> findAll();
}
