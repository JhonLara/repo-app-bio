package com.repodoc.appbio.repository;

import org.apache.el.util.Validation;
import org.springframework.data.repository.CrudRepository;


public interface RepoRepository extends CrudRepository<Validation, Long> {
	Integer countByIsMutant(boolean value);
}