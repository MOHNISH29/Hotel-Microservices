package com.example.demo.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Services.UserService;

@RestController
@RequestMapping("/user")
public class userController {
	
	@Autowired
	public UserService userService;
	
	@PostMapping("/")
	public ResponseEntity<User> saveUser(@RequestBody User user)
	{
		User user1 = userService.createUser(user);
		return new ResponseEntity<User>(user1 , HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable Integer userId)
	{
		User user1 = userService.getUserById(userId);
		return  ResponseEntity.ok(user1);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUsers()
	{
		List<User> user1 = userService.getAllUser();
		return ResponseEntity.ok(user1);
	}
}
