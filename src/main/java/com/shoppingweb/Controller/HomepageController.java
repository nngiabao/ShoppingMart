package com.shoppingweb.Controller;

import com.shoppingweb.Entity.Category;
import com.shoppingweb.Entity.Product;
import com.shoppingweb.Service.CategoryService;
import com.shoppingweb.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomepageController {

    @Autowired
    private CategoryService categoryService;
    //
    @Autowired
    private ProductService productService;
    //load index
    @GetMapping("/")
    public String index(Model model){
        //load category
        List<Category> categoryList = categoryService.getAllCategories();
        model.addAttribute("categoryList",categoryList);
        //load products
        List<Product> productList = productService.getAllProducts();
        System.out.println("size: "+productList.size());
        model.addAttribute("productList",productList);
        //
        return "index";
    }
    //shop page
    @GetMapping("/shop")
    public String shop(Model model){
        //load products
        List<Product> productList = productService.getAllProducts();
        System.out.println("size: "+productList.size());
        model.addAttribute("productList",productList);
        return "shop";
    }

}
