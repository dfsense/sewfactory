package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductControl {
    @GetMapping("/products")
    public String showProducts(Model model){
        return "products";
    }
}
