package com.diplom.service.impl;

import java.util.ArrayList;
import java.util.Collection;


import javax.inject.Inject;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diplom.dao.StudentDao;
import com.diplom.dao.TeatherDao;
import com.diplom.model.Student;
import com.diplom.model.Teather;
import com.diplom.service.StudentService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Inject
	private StudentService studentService;
	@Inject 
	private TeatherDao teatherDao;	

	@Transactional
	public UserDetails loadUserByUsername(String email) {
		Student student = studentService.findByEmail(email);
		if (student == null) {
			Teather teather = teatherDao.findByEmail(email);
			if (teather == null)
				throw new UsernameNotFoundException("Error in email");
			
			
			Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
			return new User(teather.getId().toString(), teather.getPassword(), authorities);
			
		}

		Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		return new User(student.getId().toString(), student.getPassword(), authorities);

	}

}