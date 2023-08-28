package com.example.validation_user.controller;

import com.example.validation_user.entity.User;
import com.example.validation_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Column;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("user",new User());
        return "user/create";
    }
    @PostMapping("/create")
    public String doCreate(@Validated @ModelAttribute("user") User user , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "user/create";
        }
        userService.create(user);
        return "redirect:/user/list";
    }
    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("users",userService.findAll());
        return "user/list";
    }
}
