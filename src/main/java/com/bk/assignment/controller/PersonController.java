package com.bk.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bk.assignment.entity.Person;
import com.bk.assignment.service.PersonService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/api")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@PostMapping("/person")
	public ResponseEntity<Person> createPerson(@RequestBody Person person) 
	{
		log.info("createPerson in controller started");
		 Person createPerson = personService.createPerson(person);
		 log.info("method ended");
		return new ResponseEntity<>(createPerson, HttpStatus.CREATED);
		
		
		
	}
	
	@GetMapping("/get/{id}")
	public Person getPerson(@PathVariable int id) {
		log.info("getPerson in controller started");
		return personService.getPerson(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletePerson(@PathVariable int id) {
				log.info("deletePerson in controller started");

		return personService.deletePerson(id);
		
	}
	
	

}
