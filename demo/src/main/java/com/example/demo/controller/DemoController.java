package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serviceLib.service.DataService;

@RestController
public class DemoController {

	@Autowired
	private DataService dataService;
	
	@GetMapping("/greet")
	public String greeting() {
		return dataService.getMessage();
	}
	
}
