package com.brainstation23.studentApp.service;

import com.brainstation23.studentApp.dao.StudentJdbcRepository;
import com.brainstation23.studentApp.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentJdbcRepository repository;

    public StudentService(StudentJdbcRepository repository) {
        this.repository = repository;
    }

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student findById(int id) {
        return repository.findById(id);
    }

    public void save(Student student) {
        repository.save(student);
    }

    public void update(Student student) {
        repository.update(student);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
