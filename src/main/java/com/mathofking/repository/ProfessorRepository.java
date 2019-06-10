package com.mathofking.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.mathofking.model.Professor;

@Repository
public interface ProfessorRepository extends ReactiveMongoRepository<Professor, String>{

	
	
}
