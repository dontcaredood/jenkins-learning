package com.example.demo;

import org.springframework.web.bind.annotation.*;
//Test
@RestController
public class DemoController {
	@RequestMapping(value="", produces="application/json")
	public String welcome() {
		System.out.println("Demo Application running!");
		return "Welcome to Jenkins learning Buddy!";
	}
}
