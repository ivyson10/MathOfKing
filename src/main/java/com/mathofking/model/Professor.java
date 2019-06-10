package com.mathofking.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Professor extends AbstractEntity {

	public Professor(String nome, String senha) {
		super();
		this.nome = nome;
		this.senha = senha;
		
	}
	private String nome;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
		
	}
	
}
