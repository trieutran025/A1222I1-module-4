package com.example.controller;

import com.example.model.Mailbox;
import com.example.service.MailboxServiceI;
import com.example.service.MailboxServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/mailbox")
public class MailboxController {
    MailboxServiceI serviceI = new MailboxServiceImpl();
    @RequestMapping(value = "/list", method = RequestMethod.GET
//        , consumes = {"text/html"}
    )
    public String displayList(Model model){
        model.addAttribute("mails",serviceI.findAll());
        return "mailbox/list";
    }
    @GetMapping("/update")
    public String viewUpdate(Model model, @RequestParam("id") String id){
        model.addAttribute("mailbox",serviceI.findById(id));
        model.addAttribute("languages",getLanguage());
        model.addAttribute("pageSize",getPageSize());
        return "mailbox/update";
    }
    @PostMapping("/update")
    public String doEdit(@ModelAttribute("mailbox")Mailbox mailbox){
        serviceI.update(mailbox);
        return "redirect:/mailbox/list";
    }
    public List<String> getLanguage(){
        List<String> languages = new ArrayList<>();
        languages.add("Vietnamese");
        languages.add("English");
        languages.add("Japanese");
        languages.add("Chinese");
        return languages;
    }
    public List<String> getPageSize(){
       List<String> pageSizes = new ArrayList<>();
        pageSizes.add("5");
        pageSizes.add("10");
        pageSizes.add("15");
        pageSizes.add("25");
        pageSizes.add("50");
        pageSizes.add("100");
        return pageSizes;
    }
}
