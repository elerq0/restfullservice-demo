package com.elerq.restfullservice.demo.Controller;

import com.elerq.restfullservice.demo.Model.Course;
import com.elerq.restfullservice.demo.Service.CourseService;
import com.elerq.restfullservice.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAll(){
        return courseService.getAll();
    }
}
