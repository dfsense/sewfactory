package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.domain.Category;
import spring.repository.RepoCategory;

import java.util.List;

@Controller
public class CategoryControl {
    @Autowired
    RepoCategory repoCategory;

    @GetMapping("/categories")
    public String showCategories(Model model){
        List<Category> list = repoCategory.findAll();
        model.addAttribute("categories", list);
        return "categories";
    }
}
