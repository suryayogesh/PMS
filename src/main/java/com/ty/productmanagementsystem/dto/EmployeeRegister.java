package com.ty.productmanagementsystem.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRegister {
	private Integer empId;
	private String empName;
	private String empEmail;
	private long empPhone;
	private String empPassword;
	private String empRoles;
	private Integer departmentId;
	

}
