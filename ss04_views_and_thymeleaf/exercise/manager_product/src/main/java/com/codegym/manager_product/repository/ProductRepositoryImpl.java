package com.codegym.manager_product.repository;

import com.codegym.manager_product.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductRepositoryImpl implements ProductRepository{
    private  static Map<String,Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put("P001",new Product("P001","I phone 14",34000000,"mẫu mới nhập  từ bên  Mỹ  Về","Apple"));
        productMap.put("P002",new Product("P002","Sam sung galaxy S20 Ultra",20000000,"Hàng nội địa Hàn Quốc","Sam Sung"));
        productMap.put("P003",new Product("P003","TV OLed 20",15000000,"Xem phim bao nét","Oled"));
        productMap.put("P004",new Product("P004","I phone 15",53000000,"Hàng mới nhất của Apple","Apple"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product findById(String id) {
        return productMap.get(id);
    }

    @Override
    public void create(Product product) {
        if(!productMap.containsKey(product.getId())){
            productMap.put(product.getId(),product);
        }
    }

    @Override
    public void update(Product product) {
        if(productMap.containsKey(product.getId())){
            productMap.put(product.getId(),product);
        }
    }

    @Override
    public void delete(Product product) {
        if(productMap.containsKey(product.getId())){
            productMap.remove(product.getId(),product);
        }
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productNames = new ArrayList<>();
        for(Product  product: productMap.values()){
            if(product.getNameProduct().contains(name)){
                productNames.add(product);
            }
        }
        return productNames;
    }


}
