package com.nit.babul.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home_Controller {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}

}
