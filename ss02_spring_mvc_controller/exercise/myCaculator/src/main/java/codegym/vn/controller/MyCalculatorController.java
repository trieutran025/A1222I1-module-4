package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyCalculatorController {
    @GetMapping("/index")
    public String viewCalculator() {
        return "/index";
    }

    @PostMapping("/calculate")
    public String calculator(Model model, @RequestParam(value = "calculations", defaultValue = "add") String calculations,
                             @RequestParam(value = "firstNum", defaultValue = "0") int firstNum,
                             @RequestParam(value = "secondNum", defaultValue = "0") int secondNum) {
        double result = 0;
        switch (calculations) {
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
                break;
            default:
        }
        model.addAttribute("calculations", calculations);
        model.addAttribute("firstNum", firstNum);
        model.addAttribute("secondNum", secondNum);
        model.addAttribute("result", result);
        return "/index";
    }
}
