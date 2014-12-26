package com.mhalgosolinc.ruwi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
public class LoginLogoutController {
/*
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
 
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername();
	
		model.addAttribute("username", name);
		model.addAttribute("message", "Spring Security login + database example");
		return "home";
 
	}

*/
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public void index() {

	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login() {

	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public void home() {

	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {

		model.addAttribute("error", "true");
		return "login";

	}
/*
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {

		return "login";

	}
*/
}
