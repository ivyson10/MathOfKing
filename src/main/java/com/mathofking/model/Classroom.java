package com.mathofking.model;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Classroom extends AbstractEntity {
	
	private String name;
	private String token;
	private Professor professor;
	
	public Classroom(String name, String token,Professor professor) {
		super();
		this.name = name;
		this.token = token;
		this.professor = professor; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
}
