package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.CartProduct;
public interface CartProductRepo extends JpaRepository<CartProduct, Integer>{

}
