package com.abrazoarchived.common.backend.service.impl;

import com.abrazoarchived.common.backend.service.CrudService;

import java.util.List;
import java.util.Optional;

public class UniversityCrudServiceImpl implements CrudService {
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
        return Optional.empty();
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
