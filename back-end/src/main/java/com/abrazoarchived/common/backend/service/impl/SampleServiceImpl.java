package com.abrazoarchived.common.backend.service.impl;

import com.abrazoarchived.common.backend.dto.SampleDTO;
import com.abrazoarchived.common.backend.entity.Sample;
import com.abrazoarchived.common.backend.repository.SampleRepository;
import com.abrazoarchived.common.backend.service.SampleService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

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
        sampleRepository.deleteById(regNo);
    }

    @Override
    public SampleDTO getSample(String regNo) {
        return sampleRepository.findById(regNo).map(sample -> mapper.map(sample,SampleDTO.class))
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "the sample does not found in the database"));
    }

    @Override
    public List<SampleDTO> findSample(String query) {
        return null;
    }
}
