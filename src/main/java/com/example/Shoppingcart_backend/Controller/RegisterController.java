package com.example.Shoppingcart_backend.Controller;

import com.example.Shoppingcart_backend.Model.Registration;
import com.example.Shoppingcart_backend.dao.RegistrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController

public class RegisterController {


    @Autowired
    private RegistrationDao daos;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/register",consumes = "application/json",produces = "application/json")
    public Map<String,String> RegisterUser(@RequestBody Registration r){
        System.out.println(r.getName().toString());
        daos.save(r);
        HashMap<String,String> map= new HashMap<>();
        map.put("status","success");
        return map;
    }

}
