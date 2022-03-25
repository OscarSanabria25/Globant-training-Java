package com.example.SprinbootRESTSwaggerchallenge.repository;

import com.example.SprinbootRESTSwaggerchallenge.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
