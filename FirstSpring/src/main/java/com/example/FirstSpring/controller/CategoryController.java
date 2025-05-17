package com.example.FirstSpring.controller;

import com.example.FirstSpring.model.Category;
import com.example.FirstSpring.repository.CategoryRepository;
import com.example.FirstSpring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping("/api/public/categories")
    public ResponseEntity<List<Category>> getCategories() {
        List<Category> categories = categoryService.getCategories();
        return ResponseEntity.ok(categories);
    }

    @PostMapping("/api/public/categories")
    public ResponseEntity<String> createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return ResponseEntity.ok("Category created");
    }

    @DeleteMapping("/api/public/categories/{categoryId}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long categoryId) {
        String status = categoryService.deleteCategory(categoryId);

        if ("Category not found".equals(status)) {
            return ResponseEntity.status(404).body(status); // 404 Not Found
        } else {
            return ResponseEntity.ok(status); // 200 OK
        }
    }

    @PutMapping("/api/public/categories/{categoryId}")
    public ResponseEntity<String> updateCategory(@RequestBody Category category, @PathVariable Long categoryId) {
        Category updatedCategory = categoryService.updateCategory(category, categoryId);

        if (updatedCategory == null) {
            return ResponseEntity.status(404).body("Category not found");
        } else {
            return ResponseEntity.ok("Category updated successfully");
        }
    }

}
