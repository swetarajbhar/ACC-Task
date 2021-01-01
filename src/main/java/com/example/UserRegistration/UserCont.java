package com.example.UserRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserCont {
	
	@Autowired
	private UserService service;
	
	@GetMapping(value = "/")										// Get data from index.html
	public String indexpage(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
	
	@PostMapping(value = "/adduser")								//save data and direct to success.html page
	public String add(@ModelAttribute("user") User user) {
		service.save(user);
		return "success";
	}
}
