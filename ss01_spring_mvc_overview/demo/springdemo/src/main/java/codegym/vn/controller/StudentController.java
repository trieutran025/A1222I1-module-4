package codegym.vn.controler;

import codegym.vn.service.StudentServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    StudentServiceI studentServiceI;
    @GetMapping("/student/list");
    public String displayList(Model model){
        model.addAllAttributes("students",studentServiceI.findAll());
        return "student/list";
    }
}
