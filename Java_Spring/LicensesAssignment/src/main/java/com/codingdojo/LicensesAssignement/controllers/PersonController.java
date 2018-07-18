package com.codingdojo.LicensesAssignement.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.LicensesAssignement.models.Person;
import com.codingdojo.LicensesAssignement.services.PersonService;

@Controller
@RequestMapping("/persons")
public class PersonController {
	private PersonService personService;
	
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	// RENDERS NEW PERSON PAGE // 
	@GetMapping("/new")
	public String home(Model model) {
		model.addAttribute("person", new Person());
		
		ArrayList<Person> persons = personService.all();
		model.addAttribute("persons", persons);
		return "persons";
	}
	// RENDERS PROFILE PAGE // 
	@GetMapping("/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		model.addAttribute("person", personService.findOne(id));
		return "profile";
	}

	@RequestMapping(value="/process", method = RequestMethod.POST)
	public String verifyName(@Valid @ModelAttribute("person") Person person, BindingResult res) {
		System.out.println(person.getId()); 
		if (res.hasErrors()){
			return "redirect:/new";
		}
		else {
			personService.create(person);
		return "redirect:/persons/" +person.getId();
		}
	}
}
