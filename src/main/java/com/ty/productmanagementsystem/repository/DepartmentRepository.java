package com.ty.productmanagementsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.productmanagementsystem.entity.Departments;

@Repository
public interface DepartmentRepository extends JpaRepository<Departments, Integer> {

}