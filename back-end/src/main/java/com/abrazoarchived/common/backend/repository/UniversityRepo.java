package com.abrazoarchived.common.backend.repository;

import com.abrazoarchived.common.backend.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepo extends JpaRepository<University, Integer> {

}
