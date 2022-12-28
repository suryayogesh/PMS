package com.ty.productmanagementsystem.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;

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
public class Departments implements Serializable{
	@Id
	//@Column(name="department_id")
	//@NotNull
	private Integer departmentId ;
	
	@Column(name = "department_name")
	@Length(max=45)
	private String departmentName;

	//MAPPING FOR PRODUCT
	@JsonIgnore
	//@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "departments")
//	@JoinColumn(name="departmentId",referencedColumnName = "departmentId")
	private List<Product> product = Lists.newArrayList();
    // MAPPING FOR CATEGORES
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "departments")
//	@JoinColumn(name="departmentId",referencedColumnName = "departmentId")
	private List<Categories>categories= Lists.newArrayList();;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "departments")
	private List<EmployeeEntity>employeeEntities= Lists.newArrayList();;
}
