package com.pluralsight.conferencedemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hellos")
public class HelloController {

	@GetMapping
	//@RequestMapping("/hello")
	public String index() {
		return "SpringBoot Example!!!!!!!!!!!";
	}
}
