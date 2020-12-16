package com.Roster.Roster.Model;

import java.util.ArrayList;
import java.util.List;

public class Roster {
	
	static int nextId = 0;
	int id; 
	List<Long> student_id = new ArrayList<>();
	List<Long> course_id = new ArrayList<>();
	List<Long> instructor_id = new ArrayList<>();
	
	String student_firstName;
	String student_lastName;
	String cat_id; 
	String course_title;
	String section;
	String instructor_firstName;
	String instructor_lastName;
	
	public Roster(){	
		this.id = nextId++;

	}
	
	public List<Long> getStudent_id() {
		return student_id;
	}
	public void setStudent_id(List<Long> student_id) {
		this.student_id = student_id;
	}
	public String getCat_id() {
		return cat_id;
	}
	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}
	public List<Long> getInstructor_id() {
		return instructor_id;
	}
	public void setInstructor_id(List<Long> instructor_id) {
		this.instructor_id = instructor_id;
	}
	public List<Long> getCourse_id() {
		return course_id;
	}
	public void setCourse_id(List<Long> course_id) {
		this.course_id = course_id;
	}
	public String getStudent_firstName() {
		return student_firstName;
	}
	public void setStudent_firstName(String student_firstName) {
		this.student_firstName = student_firstName;
	}
	public String getStudent_lastName() {
		return student_lastName;
	}
	public void setStudent_lastName(String student_lastName) {
		this.student_lastName = student_lastName;
	}
	
	public String getCourse_title() {
		return course_title;
	}
	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getInstructor_firstName() {
		return instructor_firstName;
	}
	public void setInstructor_firstName(String instructor_firstName) {
		this.instructor_firstName = instructor_firstName;
	}
	public String getInstructor_lastName() {
		return instructor_lastName;
	}
	public void setInstructor_lastName(String instructor_lastName) {
		this.instructor_lastName = instructor_lastName;
	}
	
	public Student addStudent(Student student) {
		return student;
	}
	
	public Student getStudent() {
		
	}

}
