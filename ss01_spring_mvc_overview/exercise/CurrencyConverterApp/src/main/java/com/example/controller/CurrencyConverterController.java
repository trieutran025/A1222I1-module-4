package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverterController {
    public double converter(double moneyUSD,double rate) {
        return moneyUSD * rate;
    }

    @GetMapping("/converter/money")
    public String showConverter() {
        return "/converter/money";
    }
        @PostMapping("/swap")
    public String currencyConverter(@RequestParam double moneyUSD, @RequestParam double rate, Model model) {
        model.addAttribute("result", converter(moneyUSD,rate));
        return "/converter/money";
    }

}
