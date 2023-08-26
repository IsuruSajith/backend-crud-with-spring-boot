package com.abrazoarchived.common.backend.service.impl;

import com.abrazoarchived.common.backend.dto.UniversityDTO;
import com.abrazoarchived.common.backend.entity.University;
import com.abrazoarchived.common.backend.repository.custom.UniversityRepoWithCrud;
import com.abrazoarchived.common.backend.service.CrudService;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UniversityCrudServiceImpl implements CrudService<University,Integer> {


    private final UniversityRepoWithCrud<UniversityDTO,Integer> universityRepoWithCrud;

    public UniversityCrudServiceImpl(UniversityRepoWithCrud<UniversityDTO,Integer> universityRepoWithCrud) {
        this.universityRepoWithCrud = universityRepoWithCrud;

    }


    @Override
    public long count() throws Exception {
        return 0;
    }

    @Override
    public University save(University entity) throws Exception {
        return null;
    }

    @Override
    public void update(University entity) throws Exception {

    }

    @Override
    public void deleteById(Integer pk) throws Exception {

    }

    @Override
    public Optional<University> findById(Integer pk) throws Exception {
        return Optional.empty();
    }

    @Override
    public List<University> findAll() throws Exception {
        return null;
    }

    @Override
    public boolean existsById(Integer pk) throws Exception {
        return false;
    }
}
