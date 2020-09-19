package com.elerq.restfullservice.demo.Controller;

import com.elerq.restfullservice.demo.Model.Course;
import com.elerq.restfullservice.demo.Model.Student;
import com.elerq.restfullservice.demo.Service.CourseService;
import com.elerq.restfullservice.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @GetMapping("/students")
    public List<Student> list(){
        return studentService.getAll();
    }

    @PutMapping("/student/{studentId}/course/{courseId}/add")
    public void addCourse(@PathVariable long studentId, @PathVariable long courseId){
        Student student = studentService.get(studentId);
        Course course = courseService.get(courseId);

        studentService.addCourse(student, course);
    }

    @PutMapping("/student/{studentId}/course/{courseId}/delete")
    public void deleteCourse(@PathVariable long studentId, @PathVariable long courseId){
        Student student = studentService.get(studentId);
        Course course = courseService.get(courseId);

        studentService.deleteCourse(student, course);
    }
}
