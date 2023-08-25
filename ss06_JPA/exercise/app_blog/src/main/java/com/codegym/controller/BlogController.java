package com.codegym.controller;

import com.codegym.entity.Blog;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("blogs", blogService.findAll());
        return "blog/list";
    }@GetMapping("/detai")
    public String showDetail(Model model,@RequestParam("id") int id) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/detail";
    }

    @GetMapping("/create")
    public String showEdit(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("action", "create");
        return "/blog/create";
    }

    @GetMapping("/edit")
    public String showEdit(Model model, @RequestParam("id") int id) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("action", "edit");
        return "/blog/create";
    }
    @PostMapping("/create")
    public String doCreateOrEdit(@ModelAttribute("blog") Blog blog,
                                @RequestParam("action") String action){
        if("create".equals(action)){
            blogService.create(blog);
        }else {
            blogService.update(blog);
        }
        return "redirect:/blog/list";
    }
    @GetMapping("/delete")
    public String doDelete(@RequestParam("id") int id){
        blogService.deleteById(id);
        return "redirect:/blog/list";
    }
}
