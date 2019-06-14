package com.mathofking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mathofking.model.Problem;
import com.mathofking.repository.ProblemRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/problem")
public class ProblemController {
	
	@Autowired
	private ProblemRepository problemRepository;
	
	@RequestMapping(value = "/all")
	public Flux<Problem> getProblems() {
		return problemRepository.findAll();
	}
	
	@RequestMapping(value = "/search/{id}")
	public Mono<Problem> getById(@PathVariable String id) {
		return problemRepository.findById(id);
	}
	
	@PostMapping(value = "/save")
	public Mono<Problem> saveProblem(@RequestBody Problem problem) {
		return problemRepository.save(problem);
	}
	
	@PostMapping(value = "/edit/{id}")
	public Mono<Problem> editProblem(@PathVariable String id, @RequestBody Problem problem) {
		return problemRepository.save(problem);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteProblem(@PathVariable String id) {
		problemRepository.deleteById(id);
	}
}
