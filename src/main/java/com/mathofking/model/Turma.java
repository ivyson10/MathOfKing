package com.mathofking.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Turma extends AbstractEntity {
	
	private String nome;
	private String codigo;
	private Professor professor;
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
