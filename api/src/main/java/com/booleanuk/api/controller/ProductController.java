package com.booleanuk.api.controller;

import com.booleanuk.api.model.Product;
import com.booleanuk.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Product> getAll(){
        return this.productRepository.findAll();

    }
}