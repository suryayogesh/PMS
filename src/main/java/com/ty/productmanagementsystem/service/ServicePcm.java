package com.ty.productmanagementsystem.service;

import com.ty.productmanagementsystem.dto.CategoriesDto;
import com.ty.productmanagementsystem.dto.DepartmentDto;
import com.ty.productmanagementsystem.dto.EmployeeRegister;
import com.ty.productmanagementsystem.dto.OptionTypeDto;
import com.ty.productmanagementsystem.dto.ProductDto;
import com.ty.productmanagementsystem.dto.ProductVariationDto;
import com.ty.productmanagementsystem.dto.VariationTypeDto;

public interface ServicePcm {


	boolean registerDeparment(DepartmentDto departmentDto);

	boolean registerCategories(CategoriesDto categoriesDto);

	boolean registerVariationType(VariationTypeDto variationTypeDto);

	boolean registeroptionType(OptionTypeDto optionTypeDto);

	boolean registerProduct(ProductDto productDto);

	boolean registerProductvariation(ProductVariationDto productVariationDto);

	boolean registerEmployee(EmployeeRegister employeeRegister);

}
