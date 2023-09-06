package com.example.blog_developer.controller;

import com.example.blog_developer.entity.Blog;
import com.example.blog_developer.service.BlogService;
import com.example.blog_developer.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/list")
    public String showListBlog(Model model, @RequestParam("id") int id){
        model.addAttribute("id",id);
        model.addAttribute("blogs",blogService.findAll());
        return "blog/list";
    }

    @GetMapping("/create")
    public String showCreateBlog(Model model){
        model.addAttribute("blog",new Blog());
        model.addAttribute("categories",categoryService.findAll());
        model.addAttribute("action", "create");
        return "blog/create";
    }
    @PostMapping("/create")
    public String doCreate(@ModelAttribute("blog")Blog blog){
        blogService.create(blog);
        return "redirect:/blog/list";
    }
    @GetMapping("/detail")
    public String showDetail(Model model,@RequestParam("id") int id) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/detail";
    }
    @GetMapping("/find")
    public String showByName(@RequestParam("header") String header, Model model) {
        List<Blog> products = blogService.findByHeader(header);
        model.addAttribute("products", products);
        return "/blog/list";
    }

}
