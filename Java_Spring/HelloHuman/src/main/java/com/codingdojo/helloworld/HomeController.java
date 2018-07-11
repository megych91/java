package com.codingdojo.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
    @RequestMapping("")
    public String index(){
    	return "index.jsp";
    }
    @RequestMapping("/date")
    public String theDate() {
        return "date.jsp";
    }
    @RequestMapping("/time")
    public String theTime() {
        return "time.jsp";
    }
}