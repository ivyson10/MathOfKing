package com.mathofking.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Turma extends AbstractEntity {
	
	private String nome;
	private String codigo;
	private Professor professor;
	private List<Turma> questoes;

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
	public List<Turma> getQuestoes() {
		return questoes;
	}
	public void setQuestoes(List<Turma> questoes) {
		this.questoes = questoes;
	}
	
}
