package com.mathofking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mathofking.model.Professor;
import com.mathofking.repository.ProfessorRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProfessorController {

	@Autowired
	private ProfessorRepository professorRepository;
	
	@GetMapping(value="/professores/search/findAll")
	public Flux<Professor> buscarTodosProfessores(){
		return professorRepository.findAll();
	}
	
	@GetMapping(value="/professores/search/findOne/{id}")
	public Mono<Professor> buscarUmProfessor(@PathVariable String id){
		return professorRepository.findById(id);
	}
	
	@PostMapping(value="/professores")
	public Mono<Professor> salvaProfessor(@RequestBody Professor professor){
		return professorRepository.save(professor);
	}
	
	@PatchMapping(value="/professores/edit/{id}")
	public Mono<Professor> editarProfessor(@PathVariable String id, @RequestBody Professor professor){
		return professorRepository.save(professor);
		
	}
	
	@DeleteMapping(value="/professores/delete/{id}")
	public void deletarProfessor(@PathVariable String id){
		professorRepository.deleteById(id).subscribe();
	}
	
}
