package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entity.User;

public interface UserService {
	User createUser(User user);
	List<User>getAllUser();
	User getUserById(Integer id);

}
