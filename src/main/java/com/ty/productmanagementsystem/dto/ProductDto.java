package com.ty.productmanagementsystem.dto;

import java.time.LocalDateTime;

import com.ty.productmanagementsystem.entity.ProductVariation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
	private Integer productId;
	private String productTitel;
	private Integer categoriesId;
	private Integer departmentId;
	private Integer VariationTypeId;
	private Integer optionTypesId;
	private LocalDateTime requestOn;
	
//	private  List<ProductVariation> productVariation;

}
