package com.ty.productmanagementsystem.service;

import java.util.List;

import com.ty.productmanagementsystem.dto.CategoriesDto;
import com.ty.productmanagementsystem.dto.CategoriesResponse;
import com.ty.productmanagementsystem.dto.DepartmentDto;
import com.ty.productmanagementsystem.dto.Departmentshow;
import com.ty.productmanagementsystem.dto.FindByIdResponse;
import com.ty.productmanagementsystem.dto.FindByProductId;
import com.ty.productmanagementsystem.dto.OptionTypeDto;
import com.ty.productmanagementsystem.dto.ProductDto;
import com.ty.productmanagementsystem.dto.ShowAll;
import com.ty.productmanagementsystem.dto.VariationTypeDto;
import com.ty.productmanagementsystem.entity.Categories;
import com.ty.productmanagementsystem.entity.Departments;
import com.ty.productmanagementsystem.entity.OptionTypes;
import com.ty.productmanagementsystem.entity.Product;
import com.ty.productmanagementsystem.entity.VariationType;

public interface CrudService {
//*********************update****************************//

	Departments updateDeparment(DepartmentDto departmentDto);
	
	Categories updateCategories(CategoriesDto categoriesDto);

	VariationType updateVariationType(VariationTypeDto variationTypeDto);

	OptionTypes registoroptionType(OptionTypeDto optionTypeDto);

	Product updateProduct(ProductDto productDto);
	
	//*********************delete****************************//
	

	boolean deletedepartment(DepartmentDto departmentDto);

	boolean deleteCategories(CategoriesDto categoriesDto);

	boolean deleteVariationType(VariationTypeDto variationTypeDto);

	boolean deleteoptionType(OptionTypeDto optionTypeDto);

	boolean deleteProduct(ProductDto productDto);

	
	
	//////*************** show all ***************//

	List<Departments> showAll();

	 Departmentshow  searchDepartment(DepartmentDto departmentDto);

	 FindByIdResponse searchProduct(FindByProductId byProductId);

	CategoriesResponse searchCaegories(CategoriesDto categoriesDto);

	List<VariationType> sortByVariation();

	List<Departments> sortByDepartment();

	List<Product> sortByProduct();

	List<Product> sortProductcategories();

	List<Product> showAllProduct();

	List<Product> sortProductRegisteredTime();

}
