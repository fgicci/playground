package com.gicci.playground.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/web")
public class WelcomeController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String sayWelcome(@RequestParam(value = "name", required = false) String name, Model model) {
		model.addAttribute("name", name == null ? "Jow" : name);
		return "welcome";
	}
}
