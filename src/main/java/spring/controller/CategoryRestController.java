package spring.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.domain.Category;
import spring.repository.RepoCategory;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CategoryRestController {
    @Autowired
    RepoCategory repoCategory;

    @PostMapping("/api/category/add")
    public String addCategory(@RequestBody CategoryPOJO categoryPOJO){
        Category category = new Category(categoryPOJO);
        Category categoryNew = repoCategory.save(category);
        Map<String,String> responseBody = new HashMap<>();

        responseBody.put("code","200");
        responseBody.put("message","OK");
        responseBody.put("caregoryID", categoryNew.getId().toString());
        String json = null;
        try {
            json = new ObjectMapper().writeValueAsString(responseBody);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return json;
    }
}
