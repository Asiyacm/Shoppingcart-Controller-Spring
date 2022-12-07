package com.example.Shoppingcart_backend.dao;

import com.example.Shoppingcart_backend.Model.Shoppingcart;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingcartDao extends CrudRepository<Shoppingcart,Integer> {
}
