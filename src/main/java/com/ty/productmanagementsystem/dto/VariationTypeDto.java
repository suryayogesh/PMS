package com.ty.productmanagementsystem.dto;
import java.util.List;

import com.ty.productmanagementsystem.entity.Variation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VariationTypeDto {
	private Integer VariationTypeId;
	private String VariationTypeName;
	private  Integer categoriesId;
	private List<Variation> list;

}
