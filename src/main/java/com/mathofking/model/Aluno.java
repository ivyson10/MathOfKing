package com.mathofking.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Aluno extends AbstractEntity {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}