package com.bk.assignment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bk.assignment.entity.Person;
import com.bk.assignment.repository.PersonRepository;
import com.bk.assignment.utils.PersonNotFoundException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PersonService {
	
	
	@Autowired
	PersonRepository personRepository;
	
	
	public Person createPerson(Person person) {
		log.info("createPerson method in service layer  started with {}",person);
		Person save = personRepository.save(person);
		log.info("saved successfully");
		return save;
	}
	
	
	public Person getPerson(int id) {
		log.info("getPerson method in service started with id {}",id);
		
		Optional<Person> a = personRepository.findById( id);
		if(a.isPresent()) {
			log.info("person Object is present");
			return a.get();
		}
		
		log.info("exception occured");
		throw new PersonNotFoundException("-Person with ID " + id + " not found");
	
	}
	public ResponseEntity<String> deletePerson(int id) {
		log.info("deletePerson method in service started with id {}",id);
		Optional<Person> a = personRepository.findById( id);
		if(a.isPresent()) {
			personRepository.deleteById(id);
			log.info("person Object deleted");
			 return new ResponseEntity<>("deleted",HttpStatus.NO_CONTENT);
		}
		
		else {
			log.info("exception occured");
		throw new PersonNotFoundException("-Person with ID " + id + " not found to delete");
		}
	}
	
	
	

}
