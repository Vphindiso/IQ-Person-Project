package com.console.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/api")
public class PersonResource {

	@Autowired
	PersonService personService ;
	
	@PostMapping("/person")
	public void savePerson(@RequestBody Person person) {
		personService.savePerson(person);
	}
	
	@RequestMapping("/people")
	public List<Person> getPeople(){
		return personService.getPeople();
	}
}
