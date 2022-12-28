package com.ty.productmanagementsystem.entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
public class Product implements Serializable {
	@Id
//	@Column(name = "product_id")
//	@NotNull
	private Integer productId;
	//@Column(name="product_titel")
	@Length(max=45)
	private String productTitel;
	private LocalDateTime requestOn;
	
	//@JsonIgnore
	// @JsonManagedReference
	@ManyToOne(cascade = CascadeType.ALL)
	private Departments departments;
	
	//@JsonIgnore
	// @JsonManagedReference
	@ManyToOne(cascade = CascadeType.ALL)
	private Categories categories;
	
	//@JsonIgnore
	// @JsonManagedReference
	@ManyToOne(cascade = CascadeType.ALL)
	private VariationType variationType;
	
	//@JsonIgnore
    //@JsonManagedReference
	@ManyToOne(cascade = CascadeType.ALL)
	private OptionTypes optionTypes;
	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "product")
////	@JoinColumn(name="productId",referencedColumnName = "productId")
//	private  List<ProductVariation> productVariation;
	
}
