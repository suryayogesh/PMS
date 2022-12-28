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
public class Variation implements Serializable{
	@Id
	@GeneratedValue
//	@Column(name="variation_id")
//	@NotNull
	private Integer variationId;
//	@Column(name="Variation_name")
	@Length(max=45)
	private String VariationName;
	
	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "variation")
//	//@JoinColumn(name = "variationId")
//	private List<ProductVariation> productVariations;

	
	
}
