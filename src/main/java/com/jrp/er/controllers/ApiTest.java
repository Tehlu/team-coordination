package com.jrp.er.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/app-api")
public class ApiTest {
	
	@GetMapping
	public String getTitle() {
		return ("<h2>Hello</h2>");
	}
	
	@PostMapping//consumes="application/json"
	//@RequestMapping(method = RequestMethod.POST, value="/app-api/employees", consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody String employee) {
		return ;
	}

}
