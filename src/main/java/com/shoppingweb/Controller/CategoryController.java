package com.shoppingweb.Controller;

import com.shoppingweb.Entity.Category;
import com.shoppingweb.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    //
    @GetMapping("/categories")
    public String getAllCategory(Model model){
        //

        return "index";
    }


}
