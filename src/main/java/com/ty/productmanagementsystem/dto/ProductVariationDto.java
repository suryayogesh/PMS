package com.ty.productmanagementsystem.dto;


import com.ty.productmanagementsystem.entity.Product;
import com.ty.productmanagementsystem.entity.Variation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductVariationDto {
	
	 private Integer productvariationId;
	 private Integer productId;
	 private Integer variationId;

}
