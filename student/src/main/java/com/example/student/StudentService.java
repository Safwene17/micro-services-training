package com.example.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;

    public void save(Student student) {
        studentRepo.save(student);
    }

    public List<Student> findAll() {
        return studentRepo.findAll();
    }
}
