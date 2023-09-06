package com.example.blog_developer.service;

import com.example.blog_developer.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> findAll();
    void create(Category category);
    void update(Category category);
    void deleteById(int id);
    Category findById(int id);
}
