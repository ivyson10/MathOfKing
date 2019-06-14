package com.mathofking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mathofking.model.Classroom;
import com.mathofking.repository.ClassroomRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/classroom")
public class ClassoomController {
	
	@Autowired
	private ClassroomRepository classroomRepository;
	
	@GetMapping(value="/all")
	public Flux<Classroom> getClassrooms(){
		return classroomRepository.findAll();
	}
	
	@GetMapping(value="/search/{id}")
	public Mono<Classroom> getById(@PathVariable String id){
		return classroomRepository.findById(id);
	}
	
	@PostMapping(value = "/save")
	public Mono<Classroom> saveClassroom(@RequestBody Classroom classroom) {
		return classroomRepository.save(classroom);
	}
	
	@PatchMapping(value="/edit/{id}")
	public Mono<Classroom> editClassroom(@PathVariable String id, @RequestBody Classroom classroom){
		return classroomRepository.save(classroom);
	}
	@DeleteMapping(value = "/delete/{id}")
	public void deleteClassroom(@PathVariable String id) {
		classroomRepository.deleteById(id).subscribe();
	}
}
