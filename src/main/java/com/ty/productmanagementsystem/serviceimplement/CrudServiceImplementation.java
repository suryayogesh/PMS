package com.ty.productmanagementsystem.serviceimplement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.ty.productmanagementsystem.entity.Options;
import com.ty.productmanagementsystem.entity.Product;
import com.ty.productmanagementsystem.entity.ProductVariation;
import com.ty.productmanagementsystem.entity.Variation;
import com.ty.productmanagementsystem.entity.VariationType;
import com.ty.productmanagementsystem.exception.InvalidId;
import com.ty.productmanagementsystem.repository.CategoriesRepository;
import com.ty.productmanagementsystem.repository.DepartmentRepository;
import com.ty.productmanagementsystem.repository.OptionTypesRepository;
import com.ty.productmanagementsystem.repository.ProductRepository;
import com.ty.productmanagementsystem.repository.ProductVariationRepository;
import com.ty.productmanagementsystem.repository.VariationRepository;
import com.ty.productmanagementsystem.repository.VariationTypeRepository;
import com.ty.productmanagementsystem.service.CrudService;

@Service
public class CrudServiceImplementation implements CrudService {

	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoriesRepository categoriesRepository;
	@Autowired
	private VariationRepository variationRepository;
	@Autowired
	private VariationTypeRepository variationTypeRepository;
	@Autowired
	private OptionTypesRepository optionTypesRepository;
	@Autowired
	private ProductVariationRepository productVariationRepository;

	// entity
	@Autowired
	private Departments departments;
	@Autowired
	private Categories categories;
	@Autowired
	private Variation variation;
	@Autowired
	private VariationType variationType;
	@Autowired
	private OptionTypes optionTypes;
	@Autowired
	private Product product;
	@Autowired
	ProductVariation productVariation;

///////********************************* update*****************************************///////////////////////
	@Override
	public Departments updateDeparment(DepartmentDto departmentDto) {
		BeanUtils.copyProperties(departmentDto, departments);
		Departments departmentsSave = departmentRepository.findById(departmentDto.getDepartmentId()).orElse(null);
		if (departmentsSave != null) {
			departmentsSave.setDepartmentName(departmentDto.getDepartmentName());
			departmentRepository.save(departmentsSave);
		}
		throw new InvalidId("please enter the valid id");
	}

	@Override
	public Categories updateCategories(CategoriesDto categoriesDto) {
		BeanUtils.copyProperties(categoriesDto, categories);
		Categories categoriesSave = categoriesRepository.findById(categories.getCategoriesId()).orElse(null);
		if (categoriesSave != null) {
			categoriesSave.setCategoriesName(categories.getCategoriesName());
			categoriesRepository.save(categoriesSave);
		}
		throw new InvalidId("please enter the valid id");
	}

	@Override
	public VariationType updateVariationType(VariationTypeDto variationTypeDto) {
		BeanUtils.copyProperties(variationTypeDto, variationType);
		VariationType variationTypes = variationTypeRepository.findById(variationType.getVariationTypeId())
				.orElse(null);
		if (variationTypes != null) {
			variationTypes.setVariationTypeName(variationType.getVariationTypeName());
			List<Variation> variations = variationTypeDto.getList();
			BeanUtils.copyProperties(variations, variation);
			variationType.setVariation(variations);
			variationRepository.save(variation);
			variationTypeRepository.save(variationTypes);
			return variationTypes;
		}
		throw new InvalidId("please enter the valid id");

	}

	@Override
	public OptionTypes registoroptionType(OptionTypeDto optionTypeDto) {
		BeanUtils.copyProperties(optionTypeDto, optionTypes);
		OptionTypes optionstype = optionTypesRepository.findById(optionTypes.getOptionTypesId()).orElse(null);
		if (optionstype != null) {
			optionstype.setOptionTypesName(optionTypes.getOptionTypesName());
			optionTypesRepository.save(optionstype);
			return optionstype;
		}
		throw new InvalidId("please enter the valid id");
	}

	@Override
	public Product updateProduct(ProductDto productDto) {
		BeanUtils.copyProperties(productDto, product);
		Product productsave = productRepository.findById(product.getProductId()).orElse(null);
		if (productsave != null) {
			productsave.setProductTitel(product.getProductTitel());
			productRepository.save(productsave);
		}
		throw new InvalidId("please enter the valid id");
	}

	// **************************delete*********************************//

	@Override
	public boolean deletedepartment(DepartmentDto departmentDto) {
		Departments departments = departmentRepository.findById(departmentDto.getDepartmentId()).orElse(null);
		if (departments != null) {
			this.departmentRepository.delete(departments);
			return true;
		}
		throw new InvalidId("please enter the valid id");

	}

	@Override
	public boolean deleteCategories(CategoriesDto categoriesDto) {
		Categories categories = categoriesRepository.findById(categoriesDto.getCategoriesId()).orElse(null);
		if (categories != null) {
			this.categoriesRepository.delete(categories);
			return true;
		}
		throw new InvalidId("please enter the valid id");
	}

	@Override
	public boolean deleteVariationType(VariationTypeDto variationTypeDto) {
		VariationType variationType = variationTypeRepository.findById(variationTypeDto.getVariationTypeId())
				.orElse(null);
		if (variationType != null) {
			this.variationTypeRepository.delete(variationType);
			return true;
		}
		throw new InvalidId("please enter the valid id");
	}

	@Override
	public boolean deleteoptionType(OptionTypeDto optionTypeDto) {
		OptionTypes optionTypes = optionTypesRepository.findById(optionTypeDto.getCategoriesId()).orElse(null);
		if (optionTypes != null) {
			this.optionTypesRepository.delete(optionTypes);
			return true;

		}
		throw new InvalidId("please enter the valid id");
	}

	@Override
	public boolean deleteProduct(ProductDto productDto) {
		Product product = productRepository.findById(productDto.getProductId()).orElse(null);
		if (product != null) {
			this.productRepository.delete(product);
			return true;
		}
		throw new InvalidId("please enter the valid id");
	}
	// ******************* fetch *********************************************

	@Override
	public List<Departments> showAll() {
			List<Departments> departments = departmentRepository.findAll();
			return departments;

		
	}
	@Override
	public List<Product> showAllProduct() {
		List<Product> products=productRepository.findAll();
//	List<Categories> categories = categoriesRepository.findById(null);
//		List<Departments> department = departmentRepository.findAll();
//		List<OptionTypes> optionType = optionTypesRepository.findAll();
//		List<VariationType> variationTypes = variationTypeRepository.findAll();
//		List<Object> input = new ArrayList<Object>();
//
//		input.add(categories);
//		input.add(variationTypes);
//		input.add(optionType);
//		input.add(department);
//		input.add(products);
//	productRepository.findByDepartmentsDepartmentId(0);
		
		Optional<Product>optional=productRepository.findByDepartmentsDepartmentId(0);
		for (Product product : products) {
			
		}
		
		return products;
	}

	@Override
	public Departmentshow searchDepartment(DepartmentDto departmentDto) {
		Departments departments = departmentRepository.findById(departmentDto.getDepartmentId()).orElse(null);
		if(departments!= null) {
			Departmentshow departmentshow = new Departmentshow();
			BeanUtils.copyProperties(departments, departmentshow);
			
			return departmentshow;
		}
		
//	departmentshow.setProduct(departments.getProduct());
//	departmentshow.setCategories(departments.getCategories());
		
//		List<Categories> categories2 = departments.getCategories();
//		for (Categories categories : categories2) {
//			departmentshow.setCategoriesId(categories.getCategoriesId());
//			departmentshow.setCategoriesName(categories.getCategoriesName());
//		}
//		List<Product> product2 = departments.getProduct();
//		for (Product product : product2) {
//			departmentshow.setDepartmentId(product.getProductId());
//			departmentshow.setDepartmentName(product.getProductTitel());
//		}
//		departmentshow.setDepartmentName(departments.getDepartmentName());
//		departmentshow.setDepartmentId(departments.getDepartmentId());
		 throw new InvalidId("please enter the valid id");
		
	}

	@Override
	public FindByIdResponse searchProduct(FindByProductId byProductId) {
		Product product = productRepository.findById(byProductId.getProductId()).orElse(null);
		if (product != null) {
			FindByIdResponse productshow = new FindByIdResponse();
			productshow.setDepartmentId(product.getDepartments().getDepartmentId());
			productshow.setDepartmentName(product.getDepartments().getDepartmentName());
			productshow.setOptionTypename(product.getOptionTypes().getOptionTypesName());
			productshow.setProductId(product.getProductId());
			productshow.setProductTitel(product.getProductTitel());
			return productshow;
		}
		throw new InvalidId("please enter the valid id");
	}

	@Override
	public CategoriesResponse searchCaegories(CategoriesDto categoriesDto) {
		Categories categories = categoriesRepository.findById(categoriesDto.getCategoriesId()).orElse(null);
		if (categories != null) {
			CategoriesResponse categoriesResponse = new CategoriesResponse();
			categoriesResponse.setCategoriesId(categories.getCategoriesId());
			categoriesResponse.setCategoriesName(categories.getCategoriesName());
			categoriesResponse.setDepartmentId(categories.getDepartments().getDepartmentId());
			categoriesResponse.setDepartmentName(categories.getDepartments().getDepartmentName());
//		categoriesResponse.setProductId(categories.getProduct().get(0).getProductId());
//			categoriesResponse.setProductName(categories.getProduct().get(0).getProductTitel());
			return categoriesResponse;
		}
		throw new InvalidId("please enter the valid id");
	}
	@Override
	public List<VariationType> sortByVariation() {
		List<VariationType> optional = variationTypeRepository.findAll();
		List<VariationType> collect = optional.stream()
				.sorted((s1, s2) -> s1.getVariationTypeId().compareTo(s2.getVariationTypeId()))
				.collect(Collectors.toList());
		return collect;
	}

	@Override
	public List<Departments> sortByDepartment() {
		List<Departments> departments = departmentRepository.findAll();
		List<Departments> collect = departments.stream()
				.sorted((s1, s2) -> s1.getDepartmentId().compareTo(s2.getDepartmentId()))
				.collect(Collectors.toList());
		return collect;
		
	}

	@Override
	public List<Product> sortByProduct() {
		List<Product> products=productRepository.findAll(); 
		List<Product>productscollect=products.stream()
				.sorted((s1, s2) -> s1.getProductId().compareTo(s2.getProductId()))
				.collect(Collectors.toList());
		return productscollect;
	}

	@Override
	public List<Product> sortProductcategories() {
		List<Product> products=productRepository.findAll(); 
		List<Product>productscollect=products.stream()
				.sorted((s1, s2) -> s1.getCategories().getCategoriesId().compareTo(s2.getCategories().getCategoriesId()))
				.collect(Collectors.toList());
		return productscollect;
	}

	@Override
	public List<Product> sortProductRegisteredTime() {
		List<Product> products=productRepository.findAll(); 
		List<Product>productscollect=products.stream()
				.sorted((s1, s2) -> s1.getRequestOn().compareTo(s2.getRequestOn()))
				.collect(Collectors.toList());
		return productscollect;
		
	}

	
}
