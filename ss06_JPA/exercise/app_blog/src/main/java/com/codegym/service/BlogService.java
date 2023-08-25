package com.codegym.service;

import com.codegym.entity.Blog;

import java.util.List;

public interface BlogService {
    void create(Blog blog);
    void update(Blog blog);
    Blog findById(int id);
    List<Blog> findAll();
    void deleteById(int id);
}
