package com.elerq.restfullservice.demo.Service;

import com.elerq.restfullservice.demo.Model.Course;
import com.elerq.restfullservice.demo.Model.Student;
import com.elerq.restfullservice.demo.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAll(){
        return courseRepository.findAll();
    }

    public Course get(long id){
        return courseRepository.findById(id);
    }

    public Course get(String name){
        return courseRepository.findByName(name);
    }

    public void create(String name){
        Course course = new Course();
        course.setName(name);

        courseRepository.save(course);
    }

    public void delete(Course course){
        courseRepository.delete(course);
    }
}
