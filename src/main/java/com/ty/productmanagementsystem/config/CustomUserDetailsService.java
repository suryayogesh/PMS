package com.ty.productmanagementsystem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.ty.productmanagementsystem.entity.AppUser;
import com.ty.productmanagementsystem.repository.AppUserRepository;

import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private AppUserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AppUser user = userRepository.findByusername(username);
		if(user == null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		return new CustomUserDetails(user);
	}
	
}