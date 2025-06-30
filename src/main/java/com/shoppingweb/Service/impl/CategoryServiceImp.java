package com.shoppingweb.Service.impl;

import com.shoppingweb.DAO.CategoryRepository;
import com.shoppingweb.Entity.Category;
import com.shoppingweb.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImp implements CategoryService {
    //
    private CategoryRepository categoryRepository;
    //
    @Autowired
    public CategoryServiceImp(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    //
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    //
    @Override
    public Category getCategoryById(Long theId) {
        Optional<Category> categoryOptional = categoryRepository.findById(theId);
        Category category = null;
        //
        if (categoryOptional.isEmpty()) {
            throw new RuntimeException("Did not find category id - " + theId);
        }
        //
        return categoryOptional.get();
    }
    //
    @Override
    public void addCategory() {

    }

    @Override
    public void updateCategory() {

    }

    @Override
    public void deleteCategory() {

    }
}
