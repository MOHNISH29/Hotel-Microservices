package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Entity.Ratings;
import com.example.demo.Entity.User;
import com.example.demo.Exceptions.resourceNotFoundException;
import com.example.demo.repositories.UserRepo;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
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
		
		String url = "http://localhost:9092/rating/user/" + Integer.toString(id);
		ArrayList<Ratings> forObject = restTemplate.getForObject(url, ArrayList.class);
		
		User user1 = userRepo.findById(id).orElseThrow(()->new resourceNotFoundException(id));
		
		user1.setUserRatings(forObject);
		
		return user1;
		
		
	}

}
