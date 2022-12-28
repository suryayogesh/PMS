package com.ty.productmanagementsystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.google.common.collect.Lists;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity 
public class AppUser {
	@Id
	private String username;
	private String password;

	@OneToMany(cascade = CascadeType.ALL,targetEntity =Roles.class )
	@JoinColumn(name = "id")
////	@JoinTable(name = "map_users_roles", joinColumns = @JoinColumn(name = "user_fk"), inverseJoinColumns = @JoinColumn(name = "role_fk"))
	private List<Roles> roles = Lists.newArrayList();
}