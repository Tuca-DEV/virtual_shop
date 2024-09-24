package com.tucadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tucadev.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
