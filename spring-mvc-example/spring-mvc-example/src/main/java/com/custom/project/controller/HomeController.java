package com.custom.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.custom.project.model.User;


@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		System.out.println("Default view");
				return new ModelAndView("home");
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@RequestMapping(value="/customers", method = RequestMethod.GET)
	@ResponseBody
	public String customers() {
		System.out.println("customer is called");
		
		return "customer is called";
	}
	
	@RequestMapping(value = "/user",method = RequestMethod.POST)
	public String users(@Validated User user, Model model) {
		System.out.println("User is called");
		model.addAttribute("username", user.getUsername());
		return "user";
	}

	/*@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		return "user";
	}*/
}
