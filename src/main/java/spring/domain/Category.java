package spring.domain;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, unique = true, columnDefinition = "serial")
    private Integer id;
    @JsonView(View.REST.class)
    private String name;
    @JsonView(View.REST.class)
    private String memo;
}
