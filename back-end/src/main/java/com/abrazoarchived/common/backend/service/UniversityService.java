package com.abrazoarchived.common.backend.service;

import com.abrazoarchived.common.backend.dto.UniversityDTO;

public interface UniversityService {
    String save(UniversityDTO universityDTO);


    /*long count() throws Exception;

    T save(T entity) throws Exception;

    void update(T entity) throws Exception;

    void deleteById(ID pk)throws Exception;

    Optional<T> findById(ID pk) throws Exception;

    List<T> findAll() throws Exception;

    boolean existsById(ID pk) throws Exception;*/
}
