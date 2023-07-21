package com.abrazoarchived.common.backend.service.impl;

import com.abrazoarchived.common.backend.dto.SampleDTO;
import com.abrazoarchived.common.backend.entity.Sample;
import com.abrazoarchived.common.backend.repository.SampleRepository;
import com.abrazoarchived.common.backend.service.SampleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SampleServiceImpl implements SampleService {

    private final SampleRepository sampleRepository;

    private final ModelMapper mapper;

    public SampleServiceImpl(SampleRepository sampleRepository, ModelMapper mapper) {
        this.sampleRepository = sampleRepository;
        this.mapper = mapper;
    }

    @Override
    public void saveSample(SampleDTO sample) {
        sampleRepository.save(mapper.map(sample, Sample.class));
    }

    @Override
    public void updateSample(SampleDTO sample) {
        sampleRepository.save(mapper.map(sample, Sample.class));
    }

    @Override
    public void deleteSample(String regNo) {

    }

    @Override
    public SampleDTO getSample(String regNo) {
        return null;
    }

    @Override
    public List<SampleDTO> findSample(String query) {
        return null;
    }
}
