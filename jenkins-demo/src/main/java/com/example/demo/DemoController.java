package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
	@RequestMapping(value="", produces="application/json")
	public String welcome() {
		return "Welcome Buddy!";
	}
}
