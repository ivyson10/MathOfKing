package com.mathofking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mathofking.model.Questao;
import com.mathofking.repository.QuestaoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class QuestaoController {

	@Autowired
	private QuestaoRepository questaoRepository;
	
	@GetMapping(value="/questoes/search/findAll")
	public Flux<Questao> buscarTodosquestoes(){
		return questaoRepository.findAll();
	}
	
	@GetMapping(value="/questoes/search/findOne/{id}")
	public Mono<Questao> buscarUmQuestao(@PathVariable String id){
		return questaoRepository.findById(id);
	}
	
	@PostMapping(value="/questoes")
	public Mono<Questao> salvaQuestao(@RequestBody Questao questao){
		return questaoRepository.save(questao);
	}
	
	@PatchMapping(value="/questoes/edit/{id}")
	public Mono<Questao> editarQuestao(@PathVariable String id, @RequestBody Questao questao){
		return questaoRepository.save(questao);
		
	}
	
	@DeleteMapping(value="/questoes/delete/{id}")
	public void deletarQuestao(@PathVariable String id){
		questaoRepository.deleteById(id).subscribe();
	}
	
}
