package com.Roster.Roster.Model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	List<Long> id = new ArrayList<Long>();
	String firstName;
	String lastName;
	
	
	public Student(List<Long> id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public List<Long> getId() {
		return id;
	}
	public void setId(List<Long> id) {
		this.id = id;
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
