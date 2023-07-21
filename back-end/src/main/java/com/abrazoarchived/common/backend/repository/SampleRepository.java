package com.abrazoarchived.common.backend.repository;

import com.abrazoarchived.common.backend.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, String> {

}
