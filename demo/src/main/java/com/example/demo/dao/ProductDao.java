package com.example.demo.dao;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDao {

    private final ProductRepository productRepository;

    @Autowired
    public ProductDao(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findBySequence(String sequence) {
        return productRepository.findBySequence(sequence);
    }

}

