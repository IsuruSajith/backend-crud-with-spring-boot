package com.abrazoarchived.common.backend.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int admissionNo;
    @Column(name = "admission_date",nullable = false)
    private Date addmissionDate;
    @Type(type = "json")
    @Column(nullable = false, length = 100,columnDefinition = "json")
    private ArrayList courses;
    @Column(length = 100)
    private String faculty;
    @Type(type = "json")
    @Column(name = "contact_numbers",length = 20,columnDefinition = "json")
    private ArrayList contactNumbers;

    @Column(name = "active_status",columnDefinition = "TINYINT default 0")
    private boolean activeStatus;

}
