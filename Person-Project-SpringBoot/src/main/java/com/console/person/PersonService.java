package com.console.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.console.person.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	public void savePerson(Person person) {
		repository.save(person);
	}
	
	public List<Person> getPeople(){
		List<Person> people = (List<Person>) repository.findAll();
		return people;
	} 
}
