package com.shoppingweb.DAO;

import com.shoppingweb.Controller.CategoryController;
import com.shoppingweb.Entity.Category;
import com.shoppingweb.Service.CategoryService;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface CategoryRepository extends JpaRepository<Category,Long>{
    List<Category> findAll();
    Category save(Category category);
    void deleteById(int id);
    //
}
