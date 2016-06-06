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

import com.diplom.DTO.LoginedUser;
import com.diplom.DTO.UserDTO;
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
			
			LoginedUser.loginedUser= new UserDTO(teather.getId(), teather.getEmail(), teather.getPassword(), teather.getName(),
					teather.getSname(), teather.getAge(), teather.getHaract(), teather.getDialog(),"teather");
			Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
			return new User(teather.getId().toString(), teather.getPassword(), authorities);
			
		}
		LoginedUser.loginedUser= new UserDTO(student.getId(), student.getEmail(), student.getPassword(), student.getName(),
				student.getSname(), student.getAge(), student.getHaract(), student.getDialog(),"Student");
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		return new User(student.getId().toString(), student.getPassword(), authorities);

	}

}