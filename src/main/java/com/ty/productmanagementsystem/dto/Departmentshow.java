package com.ty.productmanagementsystem.dto;

import java.util.List;


import com.ty.productmanagementsystem.entity.Categories;
import com.ty.productmanagementsystem.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Departmentshow {
	private Integer departmentId;
	private String departmentName;
//	private P productId;
//	private String productTitel;
//	private Integer categoriesId;
//	private String categoriesName;
	
	private List<Product> product;
	private List<Categories>categories;

}
