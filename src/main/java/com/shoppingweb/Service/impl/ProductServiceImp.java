package com.shoppingweb.Service.impl;

import com.shoppingweb.DAO.ProductRepository;
import com.shoppingweb.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {
    private ProductRepository productRepository;
    //inject
    @Autowired
    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    //list all product from store
    @Override
    public void getAllProducts() {

    }
    //
    @Override
    public void getProductByPrice() {

    }

    @Override
    public void getProductByCategory() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void updateProduct() {

    }

    @Override
    public void addProduct() {

    }



    @Override
    public void getProduct() {

    }
}
