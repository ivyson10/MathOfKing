//package com.mathofking.service;
//
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.mathofking.model.Professor;
//import com.mathofking.repository.ProfessorRepository;
//
//import reactor.core.publisher.Flux;
//
//@Component
//public class InsertData implements CommandLineRunner {
//
//	@Autowired
//	private ProfessorRepository professorRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		
//		professorRepository.deleteAll().thenMany(
//				Flux.just("Eros", "Ivyson", "Leonardo", "Walmir", "Fernando", "Karol")
//				.map(nome -> new Professor(nome, "1000")).flatMap(professorRepository::save))
//				.subscribe(System.out::println);
//		
//	}
//	
//}
