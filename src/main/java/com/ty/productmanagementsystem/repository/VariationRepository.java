package com.ty.productmanagementsystem.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.productmanagementsystem.entity.Variation;

@Repository
public interface VariationRepository extends JpaRepository<Variation, Integer> {


}
