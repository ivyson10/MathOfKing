//package com.mathofking.service;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.mathofking.model.Questao;
//import com.mathofking.repository.QuestaoRepository;
//
//import reactor.core.publisher.Mono;
//
//@Component
//public class InsertQuestoes implements CommandLineRunner {
//
//	private QuestaoRepository questaoRepository;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		gerarTabuada();
//	}
//	private void gerarTabuada() {
//		for(int i = 1; i <=9; i++)
//			for(int j = 1; j <= 9 ; j++) {
//				somar( j, i);
//				multiplicar( j, i);
//				dividir( j, i);
//				subtrair( j, i);
//			}
//	}
//	
//	private Mono<Questao> somar(Integer x, Integer y){
//		String problema = x + " + " + y;
//		Integer resposta = x + y;
//		return questaoRepository.save(new Questao(problema, resposta.toString()));
//	}
//	private Mono<Questao> multiplicar(Integer x, Integer y){
//		String problema = x + " x " + y;
//		Integer resposta = x * y;
//		return questaoRepository.save(new Questao(problema, resposta.toString()));
//	}
//	private Mono<Questao> dividir(Integer x, Integer y){
//		String problema = x + " / " + y;
//		Integer resposta = x / y;
//		return questaoRepository.save(new Questao(problema, resposta.toString()));
//	}
//	private Mono<Questao> subtrair(Integer x, Integer y){
//		String problema = x + " - " + y;
//		Integer resposta = x - y;
//		return questaoRepository.save(new Questao(problema, resposta.toString()));
//	}
//	
//}
