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
import com.codingdojo.LicensesAssignement.models.License;
import com.codingdojo.LicensesAssignement.models.Person;
import com.codingdojo.LicensesAssignement.services.LicenseService;
import com.codingdojo.LicensesAssignement.services.PersonService;


@Controller
@RequestMapping("/licenses")
public class LicenseController {
	
	private LicenseService licenseService;
	private PersonService personService;
	
	public LicenseController(LicenseService licenseService, PersonService personService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
	
	// RENDERS NEW LICENSE PAGE // 
	@GetMapping("/new")
	public String home(Model model) {
		model.addAttribute("license", new License());
		model.addAttribute("persons", personService.all());
		return "licenses";
	}
	
	@RequestMapping(value="/process", method = RequestMethod.POST)
	public String createLicense(@Valid @ModelAttribute("license")License license,@ModelAttribute("person")Person person, BindingResult res) {
		if(res.hasErrors()) {
			return "/licenses/new";
		}
		else {
		licenseService.create(license);
		return "redirect:/persons/" +person.getId();
		}
	}
}
