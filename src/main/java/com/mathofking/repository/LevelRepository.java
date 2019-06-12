package com.mathofking.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.mathofking.model.Level;

@Repository
public interface LevelRepository extends ReactiveMongoRepository<Level, String> {

}
