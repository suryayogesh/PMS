package com.ty.productmanagementsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.productmanagementsystem.entity.AppUser;
@Repository
public interface AppUserRepository extends JpaRepository<AppUser, String> {

	Optional<AppUser> findByUsername(String username);

	AppUser findByusername(String username);

}
