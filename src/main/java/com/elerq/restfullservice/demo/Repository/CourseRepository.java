package com.elerq.restfullservice.demo.Repository;

import com.elerq.restfullservice.demo.Model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Long> {

    public List<Course> findAll();

    public Course findById(long id);

    public Course findByName(String name);
}
