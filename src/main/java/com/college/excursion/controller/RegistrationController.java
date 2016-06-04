package com.college.excursion.controller;

import java.security.Principal;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.college.excursion.model.Student;
import com.college.excursion.service.StudentService;

@Controller
@RequestMapping(value="/registration")
public class RegistrationController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String registration(Model model, HttpServletRequest request, Principal principal) {
		return "registration";
	}
	@Inject
	private StudentService	studentService;
	
	@RequestMapping(value = "/save", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> createUser(@RequestBody Student student) {

		studentService.save(student);;
		return new ResponseEntity<>(HttpStatus.OK);

	}
}
