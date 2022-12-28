package com.ty.productmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FindByIdResponse {
	private Integer productId;
	private String productTitel;
	private Integer categoriesId;
	private String categoriesName;
	private Integer departmentId;
	private String departmentName;
	private Integer optionTypesId;
	private String optionTypename;

}
