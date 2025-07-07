package com.shoppingweb.Controller.Admin;

import com.shoppingweb.Service.Admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    //laod home page
    @GetMapping("/admin")
    public String admin(Model model) {
        return "admin/index";
    }
}
