package com.abrazoarchived.common.backend.service;
import java.util.List;
import java.util.Optional;
public interface CrudService<T,ID> {
     long count() throws Exception;

    T save(T entity) throws Exception;

    void update(T entity) throws Exception;

    void deleteById(ID pk)throws Exception;

    Optional<T> findById(ID pk) throws Exception;



    List<T> findAll() throws Exception;

    boolean existsById(ID pk) throws Exception;
}
