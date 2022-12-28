//package com.ty.productmanagementsystem.entity;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//import org.springframework.stereotype.Component;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//@Component
//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//
//public class ProductVariationOption {
//	@Id
//	@Column(name = " product_variation_id")
//	
//	private Integer productVariationOptionID;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Options options;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	private ProductVariation productVariation;
//
//}