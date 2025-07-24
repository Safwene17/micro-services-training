package com.example.school;

import com.example.school.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepo schoolRepo;
    private final StudentClient studentClient;
    public void save(School school) {
        schoolRepo.save(school);
    }

    public List<School> findAll() {
        return schoolRepo.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = schoolRepo.findById(schoolId)
                .orElse(School.builder()
                        .name("NOT FOUND")
                        .email("NOT FOUND")
                        .build()
                );
        var students = studentClient.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
