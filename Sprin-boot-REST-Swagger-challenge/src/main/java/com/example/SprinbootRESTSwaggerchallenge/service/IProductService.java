package com.example.SprinbootRESTSwaggerchallenge.service;

import com.example.SprinbootRESTSwaggerchallenge.model.Product;

import java.util.List;

public interface IProductService {
    void saveProduct(Product product);
    List<Product> listAllProducts();
    Product FindByIdProducto(Integer id);
    void deleteProduct(Integer id);
}
