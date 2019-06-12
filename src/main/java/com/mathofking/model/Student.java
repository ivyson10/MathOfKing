package com.mathofking.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student extends AbstractEntity {
	
	private String name;
	private Integer score;
	private Integer checkpont;
	private Classroom classroom;
	private Level level;
	
	public Student(String name, Integer score, Integer checkpont, Classroom classroom, Level level) {
		super();
		this.name = name;
		this.score  = score;
		this.checkpont = checkpont;
		this.classroom = classroom;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getCheckpont() {
		return checkpont;
	}

	public void setCheckpont(Integer checkpont) {
		this.checkpont = checkpont;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
	
	
	
	
	
	
	
	
}
