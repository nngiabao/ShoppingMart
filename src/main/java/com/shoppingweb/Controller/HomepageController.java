package com.shoppingweb.Controller;

import com.shoppingweb.Entity.Category;
import com.shoppingweb.Entity.Product;
import com.shoppingweb.Service.CategoryService;
import com.shoppingweb.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
    //load shop page
    private String shopWithPage(int pageNo,Model model){
        //load category here
        //List<Category> categoryList = categoryService.getAllCategories();
        //load product by page
        int pageSize = 9; // numbers of products in 1 page
        Pageable pageable = PageRequest.of(pageNo-1, pageSize);
        //this is from Repository
        Page<Product> page = productService.getProductByPage(pageNo, pageSize);
        List<Product> listProducts = page.getContent();
        //
        model.addAttribute("listProduct", listProducts);
        model.addAttribute("currentPage", pageNo);//current page
        model.addAttribute("pageSize", pageSize);// page size
        model.addAttribute("totalPages", page.getTotalPages());//total page
        model.addAttribute("totalItems", page.getTotalElements());

        return "shop";
    }
    //shop page
    @GetMapping("/shop")
    public String shop(Model model){
        return shopWithPage(1,model);
    }
    //this is like the skeleton of the website

    //detail
    //load followed by page
    @GetMapping("/shop/{pageNo}")
    //public String shop(@PathVariable int pageNo, Model model) {
    public String shop(@PathVariable(value="pageNo") int pageNo, Model model) {
        return shopWithPage(pageNo, model);
    }
}
