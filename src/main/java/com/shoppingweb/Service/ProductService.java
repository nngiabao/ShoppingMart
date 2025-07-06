package com.shoppingweb.Service;

import com.shoppingweb.Entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;
public interface ProductService {
    //
    public void getProduct();
    public List<Product> getAllProducts();
    public Page<Product> getProductByPage(int page, int pageSize);
    public void addProduct();
    public void updateProduct();
    public void deleteProduct();
    public void getProductByCategory();
    public void getProductByPrice();
}
