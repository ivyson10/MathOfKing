package com.mathofking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mathofking.model.Student;
import com.mathofking.repository.StudentRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping(value = "/all")
	public Flux<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	@RequestMapping(value = "/search/{id}")
	public Mono<Student> getById(@PathVariable String id) {
		return studentRepository.findById(id);
	}
	
	@PostMapping(value = "/save")
	public Mono<Student> saveStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	@PostMapping(value = "/edit/{id}")
	public Mono<Student> editStudent(@PathVariable String id, @RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteStudent(@PathVariable String id) {
		studentRepository.deleteById(id);
	}
}
