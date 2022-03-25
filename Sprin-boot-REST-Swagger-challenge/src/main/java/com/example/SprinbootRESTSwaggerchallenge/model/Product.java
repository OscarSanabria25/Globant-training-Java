package com.example.SprinbootRESTSwaggerchallenge.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String name;
    private int age;

    public Product() {
    }

    public Product(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
