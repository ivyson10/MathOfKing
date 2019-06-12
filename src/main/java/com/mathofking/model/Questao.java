package com.mathofking.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Questao extends AbstractEntity{
	
	public Questao(String problema, String resposta) {
		super();
		this.problema = problema;
		this.resposta = resposta;
	}
	private String problema;
	private String resposta;
	
	@DBRef
	private List<Turma> turmas;
	
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public List<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
	

}
