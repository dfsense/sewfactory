package spring.domain;

import lombok.Getter;
import lombok.Setter;
import spring.controller.CategoryPOJO;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "categories")
public class Category {
    public Category() {
    }
    public Category(CategoryPOJO categoryPOJO) {
        setName(categoryPOJO.getName());
        setMemo(categoryPOJO.getMemo());
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, unique = true, columnDefinition = "serial")
    private Integer id;
    private String name;
    private String memo;
}
