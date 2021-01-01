package com.example.UserRegistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	//get user info api
	
	@GetMapping(value = "/get")
	@ResponseBody
	public List<User> listuser() {
		return userService.show();
	}
	
	
	// post or save user api
	
	@PostMapping(value = "/add")
	public boolean saveuesr(@RequestBody User user) {
		userService.save(user);
		return true;
	}
	
	
	// get info of specified user api
	
	@GetMapping(value = "/getuser/{id}")
	@ResponseBody
	public User shouser(@PathVariable(name = "id") int id) {
		return userService.showsinguser(id);
	}

}