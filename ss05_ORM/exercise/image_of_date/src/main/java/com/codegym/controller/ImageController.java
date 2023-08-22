package com.codegym.controller;

import com.codegym.entity.Image;
import com.codegym.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

@Controller
@RequestMapping("/image")
public class ImageController {
    @Autowired
    ImageService imageService;

    @GetMapping("/list")
    public String showList(Model model/*@RequestParam("id") int id*/) {
        model.addAttribute("images", imageService.findAll());
//        model.addAttribute("check",checkDate(id));
        return "image/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("image", new Image());
        return "image/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute("image") Image image) {
        imageService.add(image);
        return "redirect:/image/list";
    }

//    public boolean checkDate(int id) {
//        return imageService.checkDate(id);
//    }

    @GetMapping("/doLike")
    public String doLike(@RequestParam("id") int id) {
        imageService.updateLike(id);
        return "redirect:/image/list";
    }
}
