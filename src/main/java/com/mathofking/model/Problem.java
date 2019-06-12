package com.mathofking.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Problem extends AbstractEntity{

	private String description;
	private String solution;
	private Integer difficulty;
	private Level level;
	
	public Problem(String description, String solution, Integer difficulty, Level level) {
		super();
		this.description = description;
		this.solution = solution;
		this.difficulty = difficulty;
		this.level = level;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public Integer getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
	
	
	
}
