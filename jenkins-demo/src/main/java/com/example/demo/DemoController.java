package com.example.demo;
import java.util.*;
import org.springframework.web.bind.annotation.*;
//Test
@RestController
public class DemoController {
	public final String firstName = "first_name";
	public final String lastName = "last_name";
	@RequestMapping(value="", produces="application/json")
	public HashMap<String, String> welcome() {
		HashMap<String, String> result = new HashMap<String, String>();
		result.put(firstName, "Santhosh");
		result.put(lastName, "Kumar Pandi");
		result.put("age", "23");
		return result;
	}
}
