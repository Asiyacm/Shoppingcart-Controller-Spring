package com.example.Shoppingcart_backend.Controller;

import com.example.Shoppingcart_backend.Model.Registration;
import com.example.Shoppingcart_backend.Model.Shoppingcart;
import com.example.Shoppingcart_backend.dao.RegistrationDao;
import com.example.Shoppingcart_backend.dao.ShoppingcartDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class ShoppingcartController {

    @Autowired
    private ShoppingcartDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> Addpage(@RequestBody Shoppingcart s){
        System.out.println(s.getName().toString());
        dao.save(s);
        HashMap<String,String> map= new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Shoppingcart> Viewpage(){
        return (List<Shoppingcart>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<Shoppingcart> Serachpage(@RequestBody Shoppingcart s){
        String name = s.getName();
        System.out.println(name);
        return (List<Shoppingcart>) dao.Searchproduct(s.getName());
    }





}
