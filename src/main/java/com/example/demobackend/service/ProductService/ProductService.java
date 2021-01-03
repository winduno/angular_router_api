package com.example.demobackend.service.ProductService;

import com.example.demobackend.model.Product;
import com.example.demobackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return this.productRepository.findById(id);
    }

    @Override
    public Product save(Product model) {
        return this.productRepository.save(model);
    }

    @Override
    public void remove(Long id) {
        this.productRepository.deleteById(id);
    }
}
