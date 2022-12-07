package com.example.Shoppingcart_backend.Controller;

import com.example.Shoppingcart_backend.Model.Registration;
import com.example.Shoppingcart_backend.Model.Shoppingcart;
import com.example.Shoppingcart_backend.dao.RegistrationDao;
import com.example.Shoppingcart_backend.dao.ShoppingcartDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingcartController {

    @Autowired
    private ShoppingcartDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Addpage(@RequestBody Shoppingcart s){
        System.out.println(s.getName().toString());
        dao.save(s);
        return "Welcome to add page";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Shoppingcart> Viewpage(){
        return (List<Shoppingcart>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/search")
    public String Serachpage(){
        return "Welcome to search page";
    }



    @Autowired
    private RegistrationDao daos;
    @PostMapping(path="/register",consumes = "application/json",produces = "application/json")
    public String RegisterUser(@RequestBody Registration r){
        System.out.println(r.getName().toString());
        daos.save(r);
        return "Welcome to register page";
    }



}
