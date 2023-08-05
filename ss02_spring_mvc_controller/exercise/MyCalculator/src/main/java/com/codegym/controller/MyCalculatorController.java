package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyCalculatorController {
    @GetMapping("/calculator")
    public String showCalculator() {
        return "/calculator";
    }

    @PostMapping("calculate")
    public String doCalculate(Model model, @RequestParam(value = "operator",defaultValue = "add") String operator,
                              @RequestParam(value = "firstNum",defaultValue = "0") int firstNum,
                              @RequestParam(value = "secondNum",defaultValue = "0") int secondNum){
        double result = 0;
        switch (operator){
            case "add":
                result = (double) firstNum + secondNum;
                break;
                case "sub":
                result = (double) firstNum - secondNum;
                break;
                case "mul":
                result = (double) firstNum * secondNum;
                break;
                case "div":
                result = (double) firstNum / secondNum;
                if(result == result){
                    break;
                }else {
                    String error = "khong duoc phep chia 0";
                    model.addAttribute("error",error);
                }
                break;
            default:
                break;
        }
        model.addAttribute("firstNum",firstNum);
        model.addAttribute("secondNum",secondNum);
        model.addAttribute("operator",operator);
        model.addAttribute("result",result);
        return "/calculator";
    }
}
