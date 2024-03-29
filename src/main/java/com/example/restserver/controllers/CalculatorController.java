package com.example.restserver.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class CalculatorController {

	@GetMapping("addition")
	@ResponseBody
	public double addition(@RequestParam double first, @RequestParam double second) {
	return first+second;
	
    }
	@GetMapping("substraction")
	@ResponseBody
	public double substration(@RequestParam double first, @RequestParam double second) {
	return first-second;
	
    }
	@GetMapping("multiplication")
	@ResponseBody
	public double multiplication(@RequestParam double first, @RequestParam double second) {
	return first*second;
	
    }
}