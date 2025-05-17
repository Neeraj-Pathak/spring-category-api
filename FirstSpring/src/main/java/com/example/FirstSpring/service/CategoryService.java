package com.example.FirstSpring.service;

import com.example.FirstSpring.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getCategories();
    void createCategory(Category category);
    String deleteCategory(Long categoryId);
    Category updateCategory(Category category, Long categoryId);

}
