package com.ty.productmanagementsystem.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Component
@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductVariation implements Serializable {
	@Id
	//@NotNull
	//@Column(name ="Productvariation_id")
    private Integer productvariationId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Product product;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Variation variation;

//	@ManyToOne(cascade = CascadeType.ALL)
//	private Departments departments;
	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy ="productVariation" )
//	//@JoinColumn(name="productvariationId")
//	private List<ProductVariationOption> productVariationsoption;
	
	
}
