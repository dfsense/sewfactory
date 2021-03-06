package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.domain.Category;

@Repository
public interface RepoCategory extends JpaRepository<Category, Integer> {
}
