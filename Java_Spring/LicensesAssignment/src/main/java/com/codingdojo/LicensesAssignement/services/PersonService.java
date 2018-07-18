package com.codingdojo.LicensesAssignement.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.codingdojo.LicensesAssignement.models.Person;
import com.codingdojo.LicensesAssignement.repositories.PersonRepository;


@Service
public class PersonService {

	private PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	
	// SHOW ALL // 
	public ArrayList<Person> all() {
		return (ArrayList<Person>) personRepository.findAll();
	}
	
	
	// GET A PERSON BY IT'S ID // 
	public Person findOne(Long id) {
		return personRepository.findById(id).get();
	}
	
	
	// CREATE A PERSON // 
	public void create(Person person) {
		personRepository.save(person);
	}
	
	
	// DELETE A PERSON // 
	public void delete(Long id) {
		personRepository.deleteById(id);
	}
	
	
	//UPDATE A PERSON // 
	public void update(Person person) {
		personRepository.save(person);
	}

}

