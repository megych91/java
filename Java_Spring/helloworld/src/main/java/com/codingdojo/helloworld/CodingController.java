package com.codingdojo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/coding")
public class CodingController {
    @RequestMapping("")
    public String index(){
      return "Hello Coding Dojo!";
    }
    @RequestMapping("/python")
    public String pythonLang(){
      return "Python / Django was awesome!";
    }
    @RequestMapping("/java")
    public String javaLang(){
      return "Java / Spring is better!";
    }
}