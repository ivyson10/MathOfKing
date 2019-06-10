package com.mathofking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mathofking.model.Aluno;
import com.mathofking.repository.AlunoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class AlunoController {

	@Autowired
	AlunoRepository alunoRepository;
	
	@GetMapping(value="/alunos/search/findAll")
	public Flux<Aluno> buscarTodosalunos(){
		return alunoRepository.findAll();
	}
	
	@GetMapping(value="/alunos/search/findOne/{id}")
	public Mono<Aluno> buscarUmAluno(@PathVariable String id){
		return alunoRepository.findById(id);
	}
	
	@PostMapping(value="/alunos")
	public Mono<Aluno> salvaAluno(@RequestBody Aluno aluno){
		return alunoRepository.save(aluno);
	}
	
	@PatchMapping(value="/alunos/edit/{id}")
	public Mono<Aluno> editarAluno(@PathVariable String id, @RequestBody Aluno aluno){
		return alunoRepository.save(aluno);
	}
	
	@DeleteMapping(value="/alunos/delete/{id}")
	public void deletarAluno(@PathVariable String id){
		alunoRepository.deleteById(id).subscribe();
	}
	
}
