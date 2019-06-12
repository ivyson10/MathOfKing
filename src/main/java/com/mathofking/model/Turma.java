package com.mathofking.model;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Turma extends AbstractEntity {
	
	private String nome;
	private String codigo;
	private Professor professor;
	@DBRef
	private List<Questao> questoes;

	public Turma(String nome, Professor professor, List<Questao> questoes) {
		super();
		this.nome = nome;
		this.codigo = UUID.randomUUID().toString().substring(0, 5);
		this.professor = professor;
		this.questoes = questoes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo() {
		this.codigo = UUID.randomUUID().toString().substring(0, 5);
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<Questao> getQuestoes() {
		return questoes;
	}
	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}
	
}
