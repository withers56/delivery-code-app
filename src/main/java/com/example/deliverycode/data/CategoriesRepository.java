package com.example.deliverycode.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Category, Long> {

    Category findCategoryByName(String name);
}
