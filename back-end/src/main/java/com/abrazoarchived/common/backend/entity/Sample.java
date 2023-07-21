package com.abrazoarchived.common.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "sample")
public class Sample {
    @Id
    private String reg;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String blood;
}
