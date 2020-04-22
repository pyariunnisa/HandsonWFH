package com.nttdata.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	  public String showForm(Model model) {
	    model.addAttribute("user", new User());
	    return "register";
	  }

	  @RequestMapping(value = "/registerSuccess", method = RequestMethod.POST)
	  public String processForm(@Valid @ModelAttribute("user") User u,
	      BindingResult bindingResult) {
	    if (bindingResult.hasErrors()) {
	      return "register";
	    } 
	      return "success";
		}
}