package io.github.victorleitecosta10.learningopenfeign.controller;

import io.github.victorleitecosta10.learningopenfeign.dto.StudentDTO;
import io.github.victorleitecosta10.learningopenfeign.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<StudentDTO> getStudents() {
        return service.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody StudentDTO student) {
        service.addNewStudent(student);
    }

}
