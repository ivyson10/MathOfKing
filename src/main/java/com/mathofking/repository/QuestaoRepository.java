package com.mathofking.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.mathofking.model.Questao;

@Repository
public interface QuestaoRepository extends ReactiveMongoRepository<Questao, String> {

}
