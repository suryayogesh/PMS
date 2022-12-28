package com.ty.productmanagementsystem.exception;
public class InvalidId extends RuntimeException{
	
	String message;
	
	public InvalidId(String message) {
		this.message= message;
	}
	
	public String getMessage() {
		
		return this.message;
	}

}
