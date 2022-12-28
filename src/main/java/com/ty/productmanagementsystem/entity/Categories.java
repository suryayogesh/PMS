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

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Categories implements Serializable {
	@Id
//	@NotNull
//	@Column(name ="categories_id")
	private Integer categoriesId;
	@Column(name="categories_name", length = 45)
//	@NotNull
	private String categoriesName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Departments departments;
	
	  // @JsonBackReference
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "categories")
	//@JoinColumn(name="categoriesId",referencedColumnName = "categoriesId")
	private List<Product> product;
	
// MAPPING FOR VARIATION TYPE
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "categories"  )
//	@JoinColumn(name="categoriesId",referencedColumnName = "categoriesId")
	private List<VariationType> variationTypes;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "categories")
	//@JoinColumn(name="categoriesId",referencedColumnName = "categoriesId")
	private List<OptionTypes>optionTypes;
}
