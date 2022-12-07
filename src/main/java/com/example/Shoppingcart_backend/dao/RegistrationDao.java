package com.example.Shoppingcart_backend.dao;


import com.example.Shoppingcart_backend.Model.Registration;
import org.springframework.data.repository.CrudRepository;

public interface RegistrationDao extends CrudRepository<Registration,Integer> {
}
