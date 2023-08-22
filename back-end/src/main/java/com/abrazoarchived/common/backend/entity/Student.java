package com.abrazoarchived.common.backend.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "student")
@TypeDefs({
        @TypeDef(name = "json",typeClass = JsonType.class)
})
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
    @Type(type = "json")
    @Column(nullable = false, length = 100)
    private ArrayList courses;
    @Column(length = 100)
    private String faculty;
    @Type(type = "json")
    @Column(name = "contact_numbers",length = 20)
    private ArrayList contactNumbers;

}
