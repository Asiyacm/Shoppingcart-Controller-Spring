package com.example.Shoppingcart_backend.dao;


import com.example.Shoppingcart_backend.Model.Registration;
import com.example.Shoppingcart_backend.Model.Shoppingcart;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RegistrationDao extends CrudRepository<Registration,Integer> {

    @Query(value = "SELECT `id`, `address`, `cpassword`, `email`, `name`, `password`, `phone` FROM `register` WHERE `name`LIKE %:name%",nativeQuery = true)
            List<Registration> Register(@Param("name") String name);
}
