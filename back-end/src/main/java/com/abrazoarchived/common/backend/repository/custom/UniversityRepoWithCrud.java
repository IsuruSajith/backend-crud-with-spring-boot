package com.abrazoarchived.common.backend.repository.custom;

import com.abrazoarchived.common.backend.entity.University;
import com.abrazoarchived.common.backend.repository.CrudRepository;

public interface UniversityRepoWithCrud<U, I extends Number> extends CrudRepository<University,Integer> {
}
