// Interface between Repository and Controller

package com.example.UserRegistration;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public void save(User user) {
		userRepo.save(user);
	}
	
	public List<User> show() {
		return userRepo.findAll();
	}
	
	public User showsinguser(int id) {
		return userRepo.findById(id).get();
	}
}
