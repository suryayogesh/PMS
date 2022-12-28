package com.ty.productmanagementsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.productmanagementsystem.entity.ProductVariation;

@Repository
public interface ProductVariationRepository extends JpaRepository<ProductVariation, Integer> {

}
