package com.spock.demo;

public class Person {
	
	private String uid;
	private String firstName;
	private String lastName;

	public static Person newInstance(String uid, String firstName, String lastName) {
		Person person = new Person();
		person.uid = uid;
		person.firstName = firstName;
		person.lastName = lastName;
		return person;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
