package com.example.secureapp_demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/aroha")
	public String home() {
		return "home.jsp";
	}


}
