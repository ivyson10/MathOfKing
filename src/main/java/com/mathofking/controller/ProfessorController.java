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

import com.mathofking.model.Professor;
import com.mathofking.repository.ProfessorRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {

		@Autowired
		private ProfessorRepository professorRepository;

		@GetMapping(value="/all")
		public Flux<Professor> getProfessors(){
			return professorRepository.findAll();
		}

		@GetMapping(value="/search/{id}")
		public Mono<Professor> getById(@PathVariable String id){
			return professorRepository.findById(id);
		}

		@PostMapping(value="/save")
		public Mono<Professor> saveProfessor(@RequestBody Professor professor){
			return professorRepository.save(professor);
		}

		@PatchMapping(value="/edit/{id}")
		public Mono<Professor> editProfessor(@PathVariable String id, @RequestBody Professor professor){
			return professorRepository.save(professor);

		}

		@DeleteMapping(value="/delete/{id}")
		public void deleteProfessor(@PathVariable String id){
			professorRepository.deleteById(id).subscribe();
		}

}
