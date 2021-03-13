package com.kamu.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.kamu.ecommerce.entity.Product;

@CrossOrigin(origins ="http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

}
