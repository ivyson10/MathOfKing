package com.mathofking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mathofking.model.Turma;
import com.mathofking.repository.TurmaRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class TurmaController {

	@Autowired
	private TurmaRepository turmaRepository;
	
	@GetMapping(value="/turmas/search/findAll")
	public Flux<Turma> buscarTodosturmas(){
		return turmaRepository.findAll();
	}
	
	@GetMapping(value="/turmas/search/findOne/{id}")
	public Mono<Turma> buscarUmTurma(@PathVariable String id){
		return turmaRepository.findById(id);
	}
	
	@PostMapping(value="/turmas")
	public Mono<Turma> salvaTurma(@RequestBody Turma Turma){
		return turmaRepository.save(Turma);
	}
	
	@PatchMapping(value="/turmas/edit/{id}")
	public Mono<Turma> editarTurma(@PathVariable String id, @RequestBody Turma Turma){
		return turmaRepository.save(Turma);
		
	}
	
	@DeleteMapping(value="/turmas/delete/{id}")
	public void deletarTurma(@PathVariable String id){
		turmaRepository.deleteById(id).subscribe();
	}
	
}
