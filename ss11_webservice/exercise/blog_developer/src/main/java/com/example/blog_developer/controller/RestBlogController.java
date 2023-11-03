package com.example.blog_developer.controller;

import com.example.blog_developer.entity.Blog;
import com.example.blog_developer.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/blogs")
public class RestBlogController {
    @Autowired
    private BlogService blogService;
    @GetMapping
    public ResponseEntity<List<Blog>> findAllBog(){
        List<Blog> blogs = blogService.findAll();
        if(blogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return  new ResponseEntity<>(blogs,HttpStatus.OK);
    }
}
