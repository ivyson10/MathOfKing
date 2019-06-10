package com.mathofking.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.mathofking.model.Turma;

@Repository
public interface TurmaRepository extends ReactiveMongoRepository<Turma, String> {
	
}
