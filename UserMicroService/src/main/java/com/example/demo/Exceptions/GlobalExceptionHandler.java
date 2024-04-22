package com.example.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.Payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(resourceNotFoundException.class)
	public ResponseEntity<ApiResponse> HandlingResourceNotFoundException(resourceNotFoundException ex)
	{
		String msg = ex.getMessage();
		ApiResponse apiResp = new ApiResponse();
		apiResp.setExceptionMessage(msg);
		return new ResponseEntity<ApiResponse>(apiResp , HttpStatus.NOT_FOUND);
	}
	
}
