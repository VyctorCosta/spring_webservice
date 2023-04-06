package com.vyctor.web_services.services;

import com.vyctor.web_services.models.Product;
import com.vyctor.web_services.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> Product = repository.findById(id);
        return Product.get();
    }
}
