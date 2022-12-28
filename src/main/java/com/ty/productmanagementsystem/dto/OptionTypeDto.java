package com.ty.productmanagementsystem.dto;

import java.util.List;

import com.ty.productmanagementsystem.entity.Options;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OptionTypeDto {
	private Integer optionTypesId;
	private String optionTypesName;
	private Integer categoriesId;
	private List<Options> option;

}