package io.github.victorleitecosta10.learningopenfeign.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {

    private Long id;

    private String name;

    private String email;

    private LocalDate dayOfBirth;

    private Integer age;
}
