package com.codingdojo.helloworld;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DojoController {
    @RequestMapping("/dojo")
    public String dojoIndex(){
    	return "The dojo is awesome!";
    }
    @RequestMapping("/{location}-dojo")
    public String locations(@PathVariable("location") String location){
    	return location + " Dojo is located in Southern California";
    }
    @RequestMapping("/{location2}")
    public String locations2(@PathVariable("location2") String location2){
    	return location2 + " is the headquarters.";
    }
}