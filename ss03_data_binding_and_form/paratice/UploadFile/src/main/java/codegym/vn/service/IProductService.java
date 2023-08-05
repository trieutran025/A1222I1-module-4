package codegym.vn.service;

import codegym.vn.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void Update(int id,Product product);
    void remove (int id);
}
