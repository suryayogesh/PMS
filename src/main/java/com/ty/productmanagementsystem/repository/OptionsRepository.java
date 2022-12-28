package com.ty.productmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.productmanagementsystem.entity.Options;

@Repository
public interface OptionsRepository extends JpaRepository<Options, Integer> {

}