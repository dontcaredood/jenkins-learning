package com.example.demo;

import org.springframework.web.bind.annotation.*;
//Test
@RestController
public class DemoController {
	@RequestMapping(value="", produces="application/json")
	public String welcome() {
		System.out.println("Author Santhosh");
		System.out.println("Demo Application running successfullyu!");
		return "Welcome to Jenkins learning Buddy!";
	}
}
