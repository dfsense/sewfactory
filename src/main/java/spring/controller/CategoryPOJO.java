package spring.controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CategoryPOJO {
    private String name;
    private String memo;

    public CategoryPOJO(){}

    public CategoryPOJO(String name, String memo){
        this.name = name;
        this.memo = memo;
    }
}
