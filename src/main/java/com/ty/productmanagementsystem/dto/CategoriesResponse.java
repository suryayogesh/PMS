package com.ty.productmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriesResponse {
	private Integer categoriesId;
	private String categoriesName;
	private Integer departmentId;
	private String departmentName;
	private String productName;
	private Integer productId;
	


}
