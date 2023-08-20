package com.codegym.manager_product.service;

import com.codegym.manager_product.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(String id);
    void create(Product product);
    void update(Product product);
    void delete(Product product);
    List<Product> findByName(String name);
}
