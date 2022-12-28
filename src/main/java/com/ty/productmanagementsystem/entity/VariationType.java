package com.ty.productmanagementsystem.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
public class VariationType implements Serializable{
	@Id
//	@Column(name = "Variation_type_id")
//	@NotNull
	@GeneratedValue
	private Integer VariationTypeId;
	@Column(name = "Variation_type_name")
	@Length(max=45)
	private String VariationTypeName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Categories categories;
	

//	// MAPPING FOR PRODUCT
//	 @JsonBackReference
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "variationType")
//	private List<Product> product;

	// MAPPING FOR variation
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "VariationTypeId", referencedColumnName = "VariationTypeId")
	private List<Variation> variation;
	

}
