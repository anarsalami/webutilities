package com.bsptechs.dao.inter;

import com.bsptechs.entities.FormColumn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormColumnDao extends CrudRepository<FormColumn, Integer> {
}