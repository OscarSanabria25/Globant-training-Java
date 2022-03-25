package com.example.SprinbootRESTSwaggerchallenge.service;

import com.example.SprinbootRESTSwaggerchallenge.model.Product;
import com.example.SprinbootRESTSwaggerchallenge.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements  IProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> listAllProducts() {
        return productRepository.findAll().stream().collect(Collectors.toList());
    }

    @Override
    public Product FindByIdProducto(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
}
