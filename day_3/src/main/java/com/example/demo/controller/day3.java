package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class day3 {
	
 @GetMapping("/sum/{a}/{b}")
	public double add(@PathVariable("a")double a,@PathVariable("b")double b){
		return a+b;
	}
 @GetMapping("/sub/{a}/{b}")
	public double sub(@PathVariable("a")double a,@PathVariable("b")double b){
		return a-b;
	}
 @GetMapping("/mul/{a}/{b}")
	public double mul(@PathVariable("a")double a,@PathVariable("b")double b){
		return a*b;
	}
 @GetMapping("/div/{a}/{b}")
	public double div(@PathVariable("a")double a,@PathVariable("b")double b){
		return a/b;
	}
}
