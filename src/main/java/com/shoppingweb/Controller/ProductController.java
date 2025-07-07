package com.shoppingweb.Controller;


import com.shoppingweb.Entity.Product;
import com.shoppingweb.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/{id}")
    public String showProduct(@PathVariable int id, Model model) {
        //
         //
        return "shop-detail";
    }

}
