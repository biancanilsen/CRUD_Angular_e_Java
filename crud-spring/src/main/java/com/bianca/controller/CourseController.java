package com.bianca.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bianca.model.Course;

@RestController
@RequestMapping("api/courses")
public class CourseController {
    @GetMapping
    public List<Course> list(){
        return null;
    }
}
