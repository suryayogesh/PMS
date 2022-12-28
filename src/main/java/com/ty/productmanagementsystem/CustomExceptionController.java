package com.ty.productmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ty.productmanagementsystem.exception.InvalidId;
import com.ty.productmanagementsystem.response.Response;

@ControllerAdvice
public class CustomExceptionController {
	
	@Autowired
	Response response;
	
	@ExceptionHandler(InvalidId.class)
	public ResponseEntity<Response> exception(InvalidId exception){
		response.setData(null);
		response.setError(true);
		response.setMessage(exception.getMessage());
		
		return new ResponseEntity<Response>(response,HttpStatus.NOT_FOUND);
	}
}
	