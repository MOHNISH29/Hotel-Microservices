package com.example.demo.Exceptions;

public class resourceNotFoundException extends RuntimeException{

	public resourceNotFoundException(Integer id)
	{
		super("Given Resource with Id" + Integer.toString(id) + " is not found!" );
	}
	
}
