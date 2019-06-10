package com.mathofking.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Questao extends AbstractEntity{
	
	private String problema;
	private String resposta;
	
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

}
