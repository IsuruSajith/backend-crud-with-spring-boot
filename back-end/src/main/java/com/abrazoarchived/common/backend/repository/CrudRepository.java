package com.abrazoarchived.common.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepository<T,ID> extends JpaRepository<T,ID> {
}
