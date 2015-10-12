package com.cisc181.core;

public class PersonException extends Exception {
	
	private Person person; 
	private String string;
	
	public PersonException(Person person) {
		super("Invalid Age");
		this.person = person;
	}
	
	
	


}
