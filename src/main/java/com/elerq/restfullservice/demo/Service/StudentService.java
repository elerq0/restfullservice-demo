package com.elerq.restfullservice.demo.Service;

import com.elerq.restfullservice.demo.Model.Course;
import com.elerq.restfullservice.demo.Model.Student;
import com.elerq.restfullservice.demo.Repository.CourseRepository;
import com.elerq.restfullservice.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public Student get(long id){
        return studentRepository.findById(id);
    }

    public Student get(String name, String surname){
        return studentRepository.findByNameAndSurname(name, surname);
    }

    public void create(String name, String surname){
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);

        studentRepository.save(student);
    }

    public void delete(Student student){
        studentRepository.delete(student);
    }

    public void addCourse(Student student, Course course){
        student.getCourses().add(course);
        //course.getStudents().add(student);

        studentRepository.save(student);
        //courseRepository.save(course);
    }

    public void deleteCourse(Student student, Course course){
        student.getCourses().remove(course);
        course.getStudents().remove(student);
    }

}
