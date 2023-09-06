package com.example.blog_developer.controller;

import com.example.blog_developer.entity.Blog;
import com.example.blog_developer.entity.Category;
import com.example.blog_developer.service.BlogService;
import com.example.blog_developer.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public String showListCategory(Model model){
        model.addAttribute("categories",categoryService.findAll());
        return "category/list";
    }
    @GetMapping("/create")
        public String showCreateCategory(Model model){
            model.addAttribute("category",new Category());
            return "category/create";
        }
    @PostMapping("/create")
    public String doCreateCategory(@ModelAttribute("category") Category category){
        categoryService.create(category);
        return "redirect:/category/list";
    }


}
