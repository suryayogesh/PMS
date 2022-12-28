package com.ty.productmanagementsystem.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.productmanagementsystem.entity.Departments;
import com.ty.productmanagementsystem.entity.Product;
import com.ty.productmanagementsystem.entity.Roles;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	Optional<Product>  findByDepartmentsDepartmentId(int d);
}
