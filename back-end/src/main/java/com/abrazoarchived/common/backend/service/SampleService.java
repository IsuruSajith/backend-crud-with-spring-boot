package com.abrazoarchived.common.backend.service;

import com.abrazoarchived.common.backend.dto.SampleDTO;

import java.util.List;

public interface SampleService {

    void saveSample(SampleDTO sample);
    void updateSample(SampleDTO sample);
    void deleteSample(String regNo);
    SampleDTO getSample(String regNo);
    List<SampleDTO> findSample(String query);
}
