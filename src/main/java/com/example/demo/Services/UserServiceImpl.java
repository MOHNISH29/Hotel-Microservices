package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Exceptions.resourceNotFoundException;
import com.example.demo.repositories.UserRepo;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	@Override
	public User createUser(User user) {
		User userReturned = userRepo.save(user);
		return userReturned;
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public User getUserById(Integer id) {
		return userRepo.findById(id).orElseThrow(()->new resourceNotFoundException(id));
		
	}

}
