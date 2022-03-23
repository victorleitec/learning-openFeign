package io.github.victorleitecosta10.learningopenfeign.gateway;

import io.github.victorleitecosta10.learningopenfeign.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(url = "${student.host}", name = "studentClient")
public interface StudentClient {

    @GetMapping("/api/v1/student")
    List<StudentDTO> getStudents();

    @PostMapping("/api/v1/student")
    void registerNewStudent(@RequestBody StudentDTO student);
}
