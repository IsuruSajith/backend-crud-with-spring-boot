package com.abrazoarchived.common.backend.repository;
import com.abrazoarchived.common.backend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, String> {
    List<Student> findAllByActiveStatusEquals(boolean status);
}
