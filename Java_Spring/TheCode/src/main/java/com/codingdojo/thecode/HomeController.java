package com.codingdojo.thecode;

import org.springframework.stereotype.Controller;
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
    public String verifyCode(@RequestParam(value = "code") String code, RedirectAttributes redirectAttributes) {
        System.out.println(code);
        if (code.equals("bushido")) {
            System.out.println(code);
            return "redirect:/code";
        } else {
            redirectAttributes.addFlashAttribute("error", "You must train harder!");
            return "redirect:/";
        }
    }

    @RequestMapping("/code")
    public String code() {
            return "theCode";
        }
    }