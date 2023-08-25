package com.abrazoarchived.common.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UniversityDTO implements Serializable {
    int id;
    String universityName;
    ArrayList<String> faculties;
    ArrayList<String> departments;
    int population;
}
