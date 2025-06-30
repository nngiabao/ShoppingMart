package com.shoppingweb.Service;

import com.shoppingweb.Entity.Product;
import java.util.List;
public interface ProductService {
    //
    public void getProduct();
    public List<Product> getAllProducts();
    public void addProduct();
    public void updateProduct();
    public void deleteProduct();
    public void getProductByCategory();
    public void getProductByPrice();
}
