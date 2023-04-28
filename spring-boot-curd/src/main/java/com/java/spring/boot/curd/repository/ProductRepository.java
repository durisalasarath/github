package com.java.spring.boot.curd.repository;

import com.java.spring.boot.curd.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
