package com.shoppingweb.Service;

import com.shoppingweb.Entity.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategories();
    public Category getCategoryById(int theId);
    public void addCategory();
    public void updateCategory();
    public void deleteCategory();

}
