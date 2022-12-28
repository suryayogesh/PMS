package com.ty.productmanagementsystem.response;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ty.productmanagementsystem.entity.VariationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Response {
	
	private int status;
	private boolean error;
	private Object data;
	private String message;
	
	

}