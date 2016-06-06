package com.diplom.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.diplom.DTO.LoginedUser;
import com.diplom.DTO.UserDTO;
import com.diplom.dao.TeatherDao;
import com.diplom.model.Student;
import com.diplom.model.Teather;
import com.diplom.service.StudentService;
import com.diplom.service.TeatherService;
import com.diplom.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Inject
	private StudentService studentService;
	@Inject
	private TeatherDao teatherDao;

	@Transactional
	public UserDTO getUserDTObyId(int id, String password) {
		Student student = studentService.findById(id);
		if (student == null) {
			Teather teather = teatherDao.findById(id);
			if (teather != null) {
				if (teather.getPassword().equals(password)) {
					return new UserDTO(teather.getId(), teather.getEmail(), teather.getPassword(), teather.getName(),
							teather.getSname(), teather.getAge(), teather.getHaract(), teather.getDialog(), "Teather");
				}
			}
		}
		if (student.getPassword().equals(password)) {
			return new UserDTO(student.getId(), student.getEmail(), student.getPassword(), student.getName(),
					student.getSname(), student.getAge(), student.getHaract(), student.getDialog(), "Student");
		}

		return null;

	}



	@Inject
	private TeatherService teatherService;

	@Transactional
	public void save() {
		if (LoginedUser.loginedUser.getRole().equals("Student")) {
			Student student = studentService.findById(LoginedUser.loginedUser.getId());
			student.setDialog(LoginedUser.loginedUser.getDialog());
			student.setHaract(LoginedUser.loginedUser.getHaract());
			studentService.update(student);
		} else {
			Teather teather = teatherService.findById(LoginedUser.loginedUser.getId());
			teather.setDialog(LoginedUser.loginedUser.getDialog());
			teather.setHaract(LoginedUser.loginedUser.getHaract());
			teatherService.update(teather);
		}
	}
	public Object getLoginUser(){
		if (LoginedUser.loginedUser.getRole().equals("Student")) {
			Student student = studentService.findById(LoginedUser.loginedUser.getId());
			return student;
		} else {
			Teather teather = teatherService.findById(LoginedUser.loginedUser.getId());
			return teather;
		}
	}
}
