package com.example.Shoppingcart_backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingcartController {

    @PostMapping("/add")
    public String Addpage(){
        return "Welcome to add page";
    }

    @GetMapping("/view")
    public String Viewpage(){
        return "Welcome to view page";
    }

    @PostMapping("/search")
    public String Serachpage(){
        return "Welcome to search page";
    }
}
