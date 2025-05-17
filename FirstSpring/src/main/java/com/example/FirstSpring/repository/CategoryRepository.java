package com.example.FirstSpring.repository;

import com.example.FirstSpring.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
