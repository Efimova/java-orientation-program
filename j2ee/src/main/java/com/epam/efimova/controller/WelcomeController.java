package com.epam.efimova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	int counter = 000000;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		String message = "aaaaaaaaaaaaaaaaaaaaaaaaa";
		
		model.addAttribute("message", "Welcome");
		model.addAttribute("counter", ++counter);
		System.out.println(model.toString());
		return "index";
	}

}
