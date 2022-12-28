package com.ty.productmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.productmanagementsystem.dto.CategoriesDto;
import com.ty.productmanagementsystem.dto.DepartmentDto;
import com.ty.productmanagementsystem.dto.EmployeeRegister;
import com.ty.productmanagementsystem.dto.OptionTypeDto;
import com.ty.productmanagementsystem.dto.ProductDto;
import com.ty.productmanagementsystem.dto.ProductVariationDto;
import com.ty.productmanagementsystem.dto.VariationTypeDto;
import com.ty.productmanagementsystem.entity.Departments;
import com.ty.productmanagementsystem.entity.Product;
import com.ty.productmanagementsystem.response.Response;
import com.ty.productmanagementsystem.service.ServicePcm;
@RequestMapping(path = "/Controller")
@RestController
public class Controller {
	@Autowired
     private Response response;
	@Autowired
	private ServicePcm servicePcm;

	
		
	
//	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/registerDeparment")
	public ResponseEntity<Response> registerDeparment(@RequestBody DepartmentDto departmentDto){
		if(servicePcm.registerDeparment(departmentDto)){
			response.setMessage("registorDeparment in sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		return null;
		
	}
//	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/registerCategories")
	public ResponseEntity<Response> registerCategories(@RequestBody CategoriesDto categoriesDto ){
		if(servicePcm.registerCategories(categoriesDto)){
			response.setMessage(" sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		return null;
		
	}
//	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/registerVariationType")
	public ResponseEntity<Response> registerVariationType(@RequestBody VariationTypeDto variationTypeDto ){
		if(servicePcm.registerVariationType(variationTypeDto)){
			response.setMessage(" sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		return null;
		
	}
//	@PreAuthorize("hasRole('ADMIN')")
	
	@PostMapping("/registeroptionType")
	public ResponseEntity<Response> registeroptionType(@RequestBody OptionTypeDto optionTypeDto ){
		if(servicePcm.registeroptionType(optionTypeDto)){
			response.setMessage(" sucessful");
			response.setStatus(200);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		return null;
	}
//	    @PreAuthorize("hasRole('ADMIN')")
		@PostMapping("/registerProduct")
		public ResponseEntity<Response> registerProduct(@RequestBody ProductDto productDto ){
			if(servicePcm.registerProduct(productDto)){
				response.setMessage("sucessful");
				response.setStatus(200);
				return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
			}
			return null;
		}
//	@PreAuthorize("hasRole('ADMIN')")
		@PostMapping("/registerProductvariation")
		public ResponseEntity<Response> registerProductvariation(@RequestBody ProductVariationDto productVariationDto ){
			if(servicePcm.registerProductvariation(productVariationDto)){
				response.setMessage(" sucessful");
				response.setStatus(200);
				return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
			}
			return null;
		
	}
		
		///// employee register
		@PostMapping("/registerEmployee")
		public ResponseEntity<Response> registorProductvariation(@RequestBody EmployeeRegister employeeRegister ){
			if(servicePcm.registerEmployee(employeeRegister)) {
				response.setMessage(" sucessful");
				response.setStatus(200);
				return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
			}
			return null;
		}
	
		

}
