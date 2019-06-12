package com.mathofking.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Professor extends AbstractEntity {

	private String name;
	private String password;

	public Professor(String name, String password) {
		super();
		this.name = name;
		this.password = password;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
		
	
}
