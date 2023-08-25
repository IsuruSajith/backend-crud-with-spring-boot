package com.abrazoarchived.common.backend.service.impl;

import com.abrazoarchived.common.backend.dto.UniversityDTO;
import com.abrazoarchived.common.backend.entity.University;
import com.abrazoarchived.common.backend.repository.UniversityRepo;
import com.abrazoarchived.common.backend.service.UniversityService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UniversityServiceImpl implements UniversityService {
    private final UniversityRepo universityRepo;
    private final ModelMapper mapper;

    public UniversityServiceImpl(UniversityRepo universityRepo, ModelMapper mapper) {
        this.universityRepo = universityRepo;
        this.mapper = mapper;
    }

    @Override
    public String save(UniversityDTO universityDTO) {
        universityRepo.save(mapper.map(universityDTO, University.class));
        return universityDTO.getUniversityName()+" saved successfully";
    }
}
