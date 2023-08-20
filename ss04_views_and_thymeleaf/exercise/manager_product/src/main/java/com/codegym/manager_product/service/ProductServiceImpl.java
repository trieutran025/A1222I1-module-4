package com.codegym.manager_product.service;

import com.codegym.manager_product.entity.Product;
import com.codegym.manager_product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository repository ;
    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findById(String id) {
        return repository.findById(id);
    }

    @Override
    public void create(Product product) {
        repository.create(product);
    }

    @Override
    public void update(Product product) {
        repository.update(product);
    }

    @Override
    public void delete(Product product) {
        repository.delete(product);
    }

    @Override
    public List<Product> findByName(String name) {
        return repository.findByName(name);
    }
}
