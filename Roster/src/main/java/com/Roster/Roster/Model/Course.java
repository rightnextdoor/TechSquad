package com.Roster.Roster.Model;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	List<Long> id = new ArrayList<Long>();
	String title;
	String cat_id;
	String section;
	
	
	public List<Long> getId() {
		return id;
	}
	public void setId(List<Long> id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCat_id() {
		return cat_id;
	}
	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}

}
