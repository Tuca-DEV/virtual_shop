package com.tucadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tucadev.course.entities.OrderItem;
import com.tucadev.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
	
}
