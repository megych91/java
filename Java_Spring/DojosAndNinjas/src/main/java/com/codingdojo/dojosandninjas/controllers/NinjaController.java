package com.codingdojo.dojosandninjas.controllers;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	
	private NinjaService ninjaService;
	private DojoService dojoService;
	
	public NinjaController(NinjaService ninjaService, DojoService dojoService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	
	// RENDERS NEW NINJA PAGE // 
	@GetMapping("/new")
	public String home(Model model) {
		model.addAttribute("ninja", new Ninja());
		
		ArrayList<Dojo> dojos = dojoService.all();
		model.addAttribute("dojos", dojos);
		return "newNinja";
	}
	
	//SHOWS NINJA BY ID // 
	@GetMapping("/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		model.addAttribute("ninja", ninjaService.findOne(id));
		return "index";
	}
	
	// RENDERS DASHBOARD PAGE // 
	@GetMapping("")
	public String dojoNinjas() {
		return "index";
	}
	
	@RequestMapping(value="/process", method = RequestMethod.POST)
	public String createNinja(@Valid @ModelAttribute("ninja")Ninja ninja,@ModelAttribute("dojo")Dojo dojo, BindingResult res) {
		if(res.hasErrors()) {
			return "/ninjas/new";
		}
		else {
		ninjaService.create(ninja);
		return "redirect:/dojos/" +dojo.getId();
		}
	}
	
	
	
	
}
