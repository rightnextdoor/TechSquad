package com.Roster.Roster.Model;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
	
	List<Long> id = new ArrayList<Long>();
	String firstName;
	String lastName;
	
	
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
