package com.mathofking.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import org.springframework.stereotype.Repository;

import com.mathofking.model.Student;

@Repository
public interface StudentRepository extends ReactiveMongoRepository<Student, String>{

}
