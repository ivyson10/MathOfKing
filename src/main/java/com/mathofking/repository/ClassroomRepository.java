package com.mathofking.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.mathofking.model.Classroom;

@Repository
public interface ClassroomRepository extends ReactiveMongoRepository<Classroom, String> {
	
}
