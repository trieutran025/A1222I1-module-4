package com.example.app_brrow_book.controller;

import com.example.app_brrow_book.entity.Book;
import com.example.app_brrow_book.entity.BrowCard;
import com.example.app_brrow_book.service.BookService;
import com.example.app_brrow_book.service.BrowCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Random;

@Controller
@RequestMapping("book")
public class BookBrowCardController {
    @Autowired
    BookService bookService;
    @Autowired
    BrowCardService browCardService;
    @GetMapping("/application")
    public String showApplication(){
        return "book/application";
    }
    @GetMapping("/listBook")
    public String showList(Model model){
        model.addAttribute("books",bookService.findAll());
        return "book/listBook";
    }
    @GetMapping("/createBook")
    public String showCreate(Model model){
        model.addAttribute("book",new Book());
        return "book/createBook";
    }
    @PostMapping("/createBook")
    public String doCreate(@ModelAttribute("book") Book book){
        bookService.create(book);
        return "redirect:/book/listBook";
    }
    @GetMapping("/detailBook")
    public String showDetail(@RequestParam("idBook") int id,Model model){
        model.addAttribute("book",bookService.findById(id));
        return "book/detailBook";
    }
    @GetMapping("/brow")
    public String browOneBook(@RequestParam("idBook") int id,Model model){
        bookService.minusOneBookQuantity(id);
        String randString = String.valueOf(MathRandom());
        BrowCard browCard = new BrowCard(randString, LocalDate.now().toString());
        browCardService.create(browCard);
        model.addAttribute("book",bookService.findById(id));
        return "book/detailBook";
    }
    @GetMapping("/return")
    public String returnOneBook(@RequestParam("idBook") int id,Model model){
        bookService.returnOneBookQuantity(id);
        model.addAttribute("book",bookService.findById(id));
        return "book/detailBook";
    }
    public  StringBuilder MathRandom(){
        Random random = new Random();
        StringBuilder randomString = null;
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            randomString = new StringBuilder();
            for (int j = 0; j < 5; j++) {
                int index = random.nextInt(characters.length());
                char randomChar = characters.charAt(index);
                randomString.append(randomChar);
        }
        return  randomString;
    }


}
