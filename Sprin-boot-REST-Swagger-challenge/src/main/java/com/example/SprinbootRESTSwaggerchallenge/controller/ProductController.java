package com.example.SprinbootRESTSwaggerchallenge.controller;

import com.example.SprinbootRESTSwaggerchallenge.model.Product;
import com.example.SprinbootRESTSwaggerchallenge.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.PrinterURI;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/products")
    public List<Product>ListAllP(){
        return productService.listAllProducts();
    }

    @PostMapping("/save")
    public String saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return "Product saved successfull";
    }

    @GetMapping("/products/{id}")
    public  Product findById(@PathVariable Integer id){
       return productService.FindByIdProducto(id);
    }

    @PutMapping("/edit/{id}")
    public  String editProduct(@PathVariable Integer id, @RequestBody Product product){
        Product product1=productService.FindByIdProducto(id);
        product1.setName(product.getName());
        product1.setAge(product.getAge());

        productService.saveProduct(product1);
        return "Product edited successfull";

    }

    @DeleteMapping("/delete/{id}")

    public  String deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
        return "Product deleted susccefull";
    }
}
