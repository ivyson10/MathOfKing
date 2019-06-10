package com.mathofking.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.mathofking.model.Aluno;

@Repository
public interface AlunoRepository extends ReactiveMongoRepository<Aluno, String>{

}
