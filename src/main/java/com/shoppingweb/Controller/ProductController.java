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

    //load followed by page
    @GetMapping("/shop/{pageNo}")
    //public String shop(@PathVariable int pageNo, Model model) {
    public String shop(@PathVariable (value="pageNo") int pageNo, Model model) {
        int pageSize = 9; // numbers of products in 1 page
        //this is from Repository
        Page<Product> page = productService.getProductByPage(pageNo, pageSize);
        List<Product> listProducts = page.getContent();
        //
        model.addAttribute("listProduct", listProducts);
        model.addAttribute("page", page);//current page
        model.addAttribute("pageSize", pageSize);//total page
        return "shop";
    }
}
