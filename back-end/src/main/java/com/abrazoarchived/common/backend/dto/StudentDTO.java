package com.abrazoarchived.common.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDTO {
    @NotBlank
    private String nic;
    @NotBlank
    private String fullName;
    @NotBlank
    private String address;
    @NotBlank
    private int admissionNo;
    @NotBlank
    private Date addmissionDate;
    @NotBlank
    private ArrayList courses;
    @NotBlank
    private String faculty;
    @NotBlank
    private ArrayList contactNumbers;
    @NotBlank
    private boolean activeStatus;
}

