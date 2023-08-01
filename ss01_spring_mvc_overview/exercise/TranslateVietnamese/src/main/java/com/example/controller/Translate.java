package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Translate {
    public String  translate(String world){
        String [] arrViet = {"Xin Chao","Toi Ten La","Cay","nam","Mot","Muoi"};
        String [] arrEng = {"Hi","My name is","Spicy","Man","One","Ten"};
        for (int i = 0; i <arrViet.length ; i++) {
            if(world.equals(arrEng[i])){
                return arrViet[i];
            }
        }
        return "Not Found";
    }
    @GetMapping("/translate/showTran")
    public String showTranslate(){
        return "/translate/showTran";
    }
    @PostMapping("/trans")
    public String translateVietnamese(@RequestParam String world, Model model){
        model.addAttribute("result",translate(world));
        return "/translate/showTran";
    }
}
