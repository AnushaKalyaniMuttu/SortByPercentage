package com.demo;

import lombok.Data;

@Data
public class Person {

	private int id;
	private String name;
	

	private double percentage;
	
	public Person(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
	
		
		this.percentage = percentage;
	}
}
