package com.example.school;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepo schoolRepo;

    public void save(School school) {
        schoolRepo.save(school);
    }

    public List<School> findAll() {
        return schoolRepo.findAll();
    }
}
