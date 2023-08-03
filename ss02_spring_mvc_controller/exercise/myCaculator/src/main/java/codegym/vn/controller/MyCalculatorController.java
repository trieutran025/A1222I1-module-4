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
    public String calculator(Model model, @RequestParam("calculations") String calculations,
                             @RequestParam("firstNum") int firstNum, @RequestParam("secondNum") int secondNum) {
        double result = 0;
        switch (calculations) {
            case "addition(+)":
                result = (double) firstNum + secondNum;
                break;
            case "subtraction(-)":
                result = (double) firstNum - secondNum;
                break;
            case "multiplication(X)":
                result =(double) firstNum  * secondNum;
                break;
            case "division(/)":
                result = (double) firstNum / secondNum;
                break;
            default:
        }
        model.addAttribute("calculations",calculations);
        model.addAttribute("firstNum",firstNum);
        model.addAttribute("secondNum",secondNum);
        model.addAttribute("result",result);
        return "/index";
    }
}
