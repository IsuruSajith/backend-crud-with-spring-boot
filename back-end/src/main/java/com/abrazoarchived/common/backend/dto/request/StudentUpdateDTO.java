package com.abrazoarchived.common.backend.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentUpdateDTO implements Serializable {
    @NotBlank
    private String nic;
    @NotBlank
    private String fullName;
    @NotBlank
    private String address;
    @NotBlank
    private ArrayList courses;
    @NotBlank
    private ArrayList contactNumbers;

}
