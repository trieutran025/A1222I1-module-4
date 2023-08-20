package com.codegym.manager_product.repository;

import com.codegym.manager_product.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(String id);
    void create(Product product);
    void update(Product product);
    void delete(Product product);

    List<Product> findByName(String name);
}

