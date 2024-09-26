package com.tucadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tucadev.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
