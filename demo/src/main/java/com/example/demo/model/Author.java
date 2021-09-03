package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Author {

	private int id;
	private String name;

	public Author(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
