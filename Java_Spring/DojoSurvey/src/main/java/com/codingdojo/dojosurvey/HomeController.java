package com.codingdojo.dojosurvey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    @RequestMapping("")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/process", method = RequestMethod.POST)
    public String processForm(
        @RequestParam(value = "name") String name, 
        @RequestParam(value = "location") String location, 
        @RequestParam(value = "language") String language,
        @RequestParam(value = "comments") String comments,
        RedirectAttributes redirectAttributes, Model model) {
        	System.out.println(name);
        	System.out.println(location);
        	System.out.println(language);
        	System.out.println(comments);
        model.addAttribute("name", name);
        model.addAttribute("location", location);
        model.addAttribute("language", language);
        model.addAttribute("comments", comments);
        	System.out.println(model);
        return "redirect:/result";
    }

    @RequestMapping("/result")
    public String allResults() {
        return "results";
        }
    }