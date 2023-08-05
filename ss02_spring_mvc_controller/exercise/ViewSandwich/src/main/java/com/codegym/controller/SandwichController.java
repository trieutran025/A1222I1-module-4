package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping("/sandwich")
    public String viewSandwich(){
        return "/sandwich";
    }
    @PostMapping("/save")
    public String save(Model model, @RequestParam(value = "condiment",defaultValue = "không có gia vị nào") String[] condiment){
        StringBuilder result= new StringBuilder();
        for(String c : condiment){
            result.append(c).append(" ");
        }
        model.addAttribute("condiment",condiment);
        model.addAttribute("result", result.toString());
        return "/sandwich" ;
    }
}
