package com.elerq.restfullservice.demo.Repository;

import com.elerq.restfullservice.demo.Model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    public List<Student> findAll();

    public Student findById(long id);

    public Student findByNameAndSurname(String name, String surname);

}
