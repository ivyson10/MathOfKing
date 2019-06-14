package com.mathofking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mathofking.model.Level;
import com.mathofking.repository.LevelRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/Level")
public class LevelController {
	
	@Autowired
	private LevelRepository levelRepository;
	
	@RequestMapping(value = "/all")
	public Flux<Level> getLevels() {
		return levelRepository.findAll();
	}
	
	@RequestMapping(value = "/search/{id}")
	public Mono<Level> getById(@PathVariable String id) {
		return levelRepository.findById(id);
	}
	
	@PostMapping(value = "/save")
	public Mono<Level> saveLevel(@RequestBody Level Level) {
		return levelRepository.save(Level);
	}
	
	@PostMapping(value = "/edit/{id}")
	public Mono<Level> editLevel(@PathVariable String id, @RequestBody Level Level) {
		return levelRepository.save(Level);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteLevel(@PathVariable String id) {
		levelRepository.deleteById(id);
	}
}
