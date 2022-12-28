package com.ty.productmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.productmanagementsystem.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}
