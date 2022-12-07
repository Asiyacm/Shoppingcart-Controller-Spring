package com.example.Shoppingcart_backend.Controller;

import com.example.Shoppingcart_backend.Model.Shoppingcart;
import com.example.Shoppingcart_backend.dao.ShoppingcartDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingcartController {

    @Autowired
    private ShoppingcartDao dao;

    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Addpage(@RequestBody Shoppingcart s){
        System.out.println(s.getName().toString());
        dao.save(s);
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
