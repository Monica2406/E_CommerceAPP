package com.ecommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {	
	    @ExceptionHandler(ResourceNotFoundException.class)
	    public String handleNotFoundException(ResourceNotFoundException ex) {
	        return ex.getMessage();
	    }
	}



