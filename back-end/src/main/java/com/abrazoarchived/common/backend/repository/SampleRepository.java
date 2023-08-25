package com.abrazoarchived.common.backend.repository;

import com.abrazoarchived.common.backend.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SampleRepository extends JpaRepository<Sample, String> {

    List<Sample> findSampleByRegLikeOrNameLikeOrBloodLike(String query1,String query2, String query3);
}
