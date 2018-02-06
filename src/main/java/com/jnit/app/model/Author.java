package com.jnit.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String authorId;
	private String authorName;

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public static long getSerialversionuauthorId() {
		return serialVersionUID;
	}

}
