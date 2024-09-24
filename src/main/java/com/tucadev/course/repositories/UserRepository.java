package com.tucadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tucadev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
