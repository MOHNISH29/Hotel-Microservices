package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(Integer id)
	{
		super("Given Hotel with Id" + Integer.toString(id) + " is not found!" );
	}
}
