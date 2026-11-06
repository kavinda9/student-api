package com.apiflow.studentapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Map<String, Object>> getStudents() {
        return List.of(
            Map.of(
                "id", 1,
                "name", "Student One",
                "course", "Software Engineering"
            ),
            Map.of(
                "id", 2,
                "name", "Student Two",
                "course", "Computer Science"
            ),
            Map.of(
                "id", 3,
                "name", "Student Three",
                "course", "Information Technology"
            )
        );
    }
}