package com.codegym.service;

import com.codegym.entity.Blog;
import com.codegym.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    BlogRepository blogRepository;
    @Override
    public void create(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        blogRepository.deleteById(id);
    }
}
