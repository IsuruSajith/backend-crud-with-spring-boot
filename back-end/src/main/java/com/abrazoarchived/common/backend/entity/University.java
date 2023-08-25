package com.abrazoarchived.common.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(length = 100, nullable = false)
    String universityName;
    @Column(length = 100, nullable = false)
    String faculties;
    @Column(length = 100, nullable = false)
    String departments;
    @Column(nullable = false)
    int population;
}
