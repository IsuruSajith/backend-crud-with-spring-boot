package com.abrazoarchived.common.backend.service.impl;

import com.abrazoarchived.common.backend.repository.CrudRepository;
import com.abrazoarchived.common.backend.repository.custom.UniversityRepoWithCrud;
import com.abrazoarchived.common.backend.service.CrudService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UniversityCrudServiceImpl implements CrudService {

    //private final CrudRepository crudRepository;
    private final UniversityRepoWithCrud universityRepoWithCrud;

    public UniversityCrudServiceImpl(CrudRepository crudRepository, UniversityRepoWithCrud universityRepoWithCrud) {
        this.universityRepoWithCrud = universityRepoWithCrud;
       // this.crudRepository = crudRepository;
    }

    @Override
    public long count() throws Exception {
        return 0;
    }

    @Override
    public Object save(Object entity) throws Exception {
        return null;
    }

    @Override
    public void update(Object entity) throws Exception {

    }

    @Override
    public void deleteById(Object pk) throws Exception {

    }

    @Override
    public Optional findById(Object pk) throws Exception {
        Optional byId = universityRepoWithCrud.findById((Integer) pk);
        return byId;
    }

    @Override
    public List findAll() throws Exception {
        return null;
    }

    @Override
    public boolean existsById(Object pk) throws Exception {
        return false;
    }
}
