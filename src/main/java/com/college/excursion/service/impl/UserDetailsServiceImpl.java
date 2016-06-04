package com.college.excursion.service.impl;

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

import com.college.excursion.dao.StudentDao;
import com.college.excursion.dao.TeatherDao;
import com.college.excursion.model.Student;
import com.college.excursion.model.Teather;
import com.college.excursion.service.StudentService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Inject
	private StudentDao studentDao;
	@Inject
	private StudentService studentService;
	@Inject 
	private TeatherDao teatherDao;	

	@Transactional
	public UserDetails loadUserByUsername(String email) {
System.out.println(email);
		Student student = studentService.findByEmail(email);
		if (student == null) {
			Teather teather = teatherDao.findByEmail(email);
			if (teather == null)
				throw new UsernameNotFoundException("Error in email");
			Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

			return new User(teather.getId().toString(), teather.getPassword(), authorities);
			
		} 

		Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();

		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

		return new User(student.getId().toString(), student.getPassword(), authorities);

	}

}