package com.mathofking.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public abstract class AbstractEntity {

	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(id.isEmpty())
			this.id = UUID.randomUUID().toString();
		else
			this.id = id;
	}
}
