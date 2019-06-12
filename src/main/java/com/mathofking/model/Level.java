package com.mathofking.model;

public class Level extends AbstractEntity{
	
	private Integer score; 
	
	public Level(Integer score) {
		super();
		this.score = score;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
	
}
