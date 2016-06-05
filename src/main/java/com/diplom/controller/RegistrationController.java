package com.diplom.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

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
import org.springframework.web.bind.annotation.ResponseBody;

import com.diplom.DTO.StudentDTO;
import com.diplom.model.Groupp;
import com.diplom.model.Student;
import com.diplom.model.Teather;
import com.diplom.service.GrouppService;
import com.diplom.service.StudentService;
import com.diplom.service.TeatherService;

@Controller

public class RegistrationController {

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(Model model, HttpServletRequest request) {
		return "registration";
	}

	@Inject
	private StudentService studentService;
	
	@Inject
	private TeatherService teatherService;

	@Inject
	private GrouppService grouppService;

	@RequestMapping(value = "registrationSt/getGroup", method = RequestMethod.GET)
	public @ResponseBody List<Groupp> getGroup() {
		List<Groupp> groupps = new ArrayList<>();
		groupps = grouppService.findAll();
		for (int i = 0; i < groupps.size(); i++) {
			groupps.get(i).setStudents(new ArrayList<>());

		}

		return groupps;

	}

	@RequestMapping(value = "/registrationSt", method = RequestMethod.GET)
	public String registrationSt(Model model, HttpServletRequest request) {
		return "registrationSt";
	}

	@RequestMapping(value = "/registrationTeath", method = RequestMethod.GET)
	public String registrationTeath(Model model, HttpServletRequest request) {
		return "registrationTeath";
	}

	@RequestMapping(value = "/registrationSt/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> registrationSt(@RequestBody StudentDTO studentDTO) {

		studentService.saveDTO(studentDTO);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@RequestMapping(value = "/registrationTeath/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> registrationTeath(@RequestBody Teather teather) {

		teatherService.save(teather);
		return new ResponseEntity<>(HttpStatus.OK);

	}
}
