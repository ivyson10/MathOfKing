package com.mathofking.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.mathofking.model.Problem;

@Repository
public interface ProblemRepository extends ReactiveMongoRepository<Problem, String> {

}
