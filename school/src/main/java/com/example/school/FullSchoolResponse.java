package com.example.school;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class FullSchoolResponse {

    private String name;
    private String email;
    List<Student> students;
}
