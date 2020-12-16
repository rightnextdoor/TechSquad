package com.Roster.Roster.Controllers;

import java.util.ArrayList;
import java.util.List;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Roster.Roster.Exception.NoSuchResourceFoundException;
import com.Roster.Roster.Model.Roster;
import com.Roster.Roster.Model.Student;





@RestController
public class RosterController {
	
	List<Roster> roster = new ArrayList<>();
	
	@PostMapping(value = "/Roster")
	@ResponseStatus(HttpStatus.CREATED)
	public Roster addRoster(@RequestBody Roster string) {
	
		roster.add(string);
		return string;
	}
	
	@GetMapping(value = "/Roster")
	@ResponseStatus(HttpStatus.OK)
	public List<Roster> getRoster(){
		return roster;
	}
	
	@GetMapping(value = "/Roster/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Roster getPostById(@PathVariable int id) throws NoSuchResourceFoundException {
		if(id > roster.size()-1) {
			throw new NoSuchResourceFoundException("Invalid id");
		}
		return roster.get(id);
	}
	
	//////student//////
	@PostMapping(value = "/Roster/{id}/Student")
	@ResponseStatus(HttpStatus.CREATED)
	public Student addStudent(@PathVariable int id, Student student) throws NoSuchResourceFoundException{
		if(id > roster.size()-1) {
			throw new NoSuchResourceFoundException("Invalid id");
		}
		
		return roster.get(id).addStudent(student);
	}
	
	@GetMapping(value = "/Roster/{id}/Student")
	@ResponseStatus(HttpStatus.OK)
	public Student getStudent(@PathVariable int id)throws NoSuchResourceFoundException{
		if(id > roster.size()-1) {
			throw new NoSuchResourceFoundException("Invalid id");
		}
		
	}

}
