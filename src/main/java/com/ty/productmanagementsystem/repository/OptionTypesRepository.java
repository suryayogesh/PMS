package com.ty.productmanagementsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.productmanagementsystem.entity.OptionTypes;

@Repository
public interface OptionTypesRepository extends JpaRepository<OptionTypes, Integer> {

}