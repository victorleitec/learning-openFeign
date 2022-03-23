package io.github.victorleitecosta10.learningopenfeign.service;

import io.github.victorleitecosta10.learningopenfeign.dto.StudentDTO;
import io.github.victorleitecosta10.learningopenfeign.gateway.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentClient client;

    public List<StudentDTO> getStudents() {
        return client.getStudents();
    }

    public void addNewStudent(StudentDTO dto) {
        client.registerNewStudent(dto);
    }
}
