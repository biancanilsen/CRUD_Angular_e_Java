package com.bianca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bianca.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
