package com.codegym.manager_product.controller;

import com.codegym.manager_product.entity.Product;
import com.codegym.manager_product.service.ProductService;
import com.codegym.manager_product.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String showList(Model model){
        List<Product> products = service.findAll();
        model.addAttribute("products",products);
        return "product/list";
    }
    @GetMapping("/detail")
    public String showDetail(Model model,@RequestParam("id")String id){
        model.addAttribute("products",service.findById(id));
            return "/product/list";
    }
    @GetMapping("/create")
    public  String showCreate(Model model){
        model.addAttribute("product",new Product());
        model.addAttribute("action","create");
        return"/product/create";
    }
    @GetMapping("/edit")
    public  String showEdit(Model model,@RequestParam("id") String id){
        model.addAttribute("product",service.findById(id));
        model.addAttribute("action","edit");
        return"/product/create";
    }
    @PostMapping("/create")
    public String doCreate(@ModelAttribute("product") Product product,
                           @RequestParam("action") String action){
        if("create".equals(action)){
            service.create(product);
        }else {
            service.update(product);
        }
        return "redirect:/product/list";
    }
    @GetMapping("/delete")
    public String doDelete(@RequestParam("id") String id){
         Product product = service.findById(id);
        service.delete(product);
        return "redirect:/product/list";
    }
    @GetMapping("/find")
    public String showByName(@RequestParam("nameProduct") String nameProduct, Model model){
        List<Product> products = service.findByName(nameProduct);
        model.addAttribute("products",products);
        return "/product/list";
    }
}
