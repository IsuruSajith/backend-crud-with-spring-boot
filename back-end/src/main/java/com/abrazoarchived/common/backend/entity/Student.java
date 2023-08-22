package com.abrazoarchived.common.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "student")
public class Student {
    @Id
    private String nic;
    @Column(name = "full_name",nullable = false)
    private String fullName;
    @Column(nullable = false)
    private String address;
    @Column(name = "admission_no",nullable = false,length = 50)
    private int admissionNo;
    @Column(name = "admission_date",nullable = false)
    private Date addmissionDate;
    @Column(nullable = false, length = 100)
    private ArrayList courses;
    @Column(length = 100)
    private String faculty;
    private ArrayList contactNumbers;

}
