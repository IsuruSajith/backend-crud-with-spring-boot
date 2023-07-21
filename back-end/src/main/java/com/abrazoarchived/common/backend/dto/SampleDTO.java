package com.abrazoarchived.common.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SampleDTO implements Serializable {
    @NotBlank
    private String reg;
    @NotBlank
    private String name;
    @NotBlank
    private String blood;

}
