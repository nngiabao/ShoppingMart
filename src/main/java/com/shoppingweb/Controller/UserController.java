package com.shoppingweb.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    //
    @GetMapping("/login")
    public String login(){
        //
        return "login";
    }
    //
    @GetMapping("/register")
    public String register(){
        //

        return "register";
    }
    //
    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }
}
