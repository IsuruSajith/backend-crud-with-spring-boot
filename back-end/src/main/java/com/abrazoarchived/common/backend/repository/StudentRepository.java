package com.abrazoarchived.common.backend.repository;
import com.abrazoarchived.common.backend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, String> {

}
