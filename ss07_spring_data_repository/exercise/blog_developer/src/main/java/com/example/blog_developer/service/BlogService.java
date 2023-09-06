package com.example.blog_developer.service;

import com.example.blog_developer.entity.Blog;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BlogService {
    List<Blog> findAll();
    void create(Blog blog);
    void update(Blog blog);
    void deleteById(int id);
    Blog findById(int id);

//    List<Blog> findByHeader(String header);
}
