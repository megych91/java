package com.codingdojo.language.controllers;

import java.util.ArrayList;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.codingdojo.language.models.Language;
import com.codingdojo.language.services.LanguageService;

@Controller
@RequestMapping("/languages")
public class LanguageController {
	private LanguageService languageService;

	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("")
	public String languages(Model model) {
		model.addAttribute("language", new Language());

		ArrayList<Language> languages = languageService.all();
		model.addAttribute("languages", languages);
		return "index";
	}

	@GetMapping("/{id}/update")
	public String findOne(Model model, @PathVariable("id") Long id) {
		model.addAttribute("language", languageService.findOne(id));
		return "update";
	}

	@GetMapping("/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		model.addAttribute("language", languageService.findOne(id));
		return "profile";
	}

	@PostMapping("/{id}")
	public String destroy(@PathVariable("id") Long id) {
		languageService.destroy(id);
		return "redirect:/languages";
	}

	@PostMapping("")
	public String create(@Valid @ModelAttribute("language") Language language, BindingResult res) {
		if (res.hasErrors()) {
			return "index";
		}

		languageService.create(language);
		System.out.println(language);
		return "redirect:/languages";
	}

	@PostMapping("/{id}/update")
	public String update(@Valid @ModelAttribute("language") Language language, BindingResult res) {
		if (res.hasErrors()) {
			return "update";
		}
		languageService.update(language);
		return "redirect:/languages";
	}

}
