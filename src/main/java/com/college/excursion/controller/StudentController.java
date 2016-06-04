package com.college.excursion.controller;

import java.security.Principal;
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

import com.college.excursion.model.Groupp;
import com.college.excursion.model.Haract;
import com.college.excursion.model.Student;
import com.college.excursion.service.StudentService;

@Controller
@RequestMapping(value = { "/student" })
public class StudentController {

	@RequestMapping(method = RequestMethod.GET)
	public String student(Model model, HttpServletRequest request, Principal principal) {
		return "student";
	}

	@Inject
	StudentService studentService;
	
	@RequestMapping(value = { "/getAll"}, method = RequestMethod.GET)
	public @ResponseBody List<Student>  studentAll(Model model, HttpServletRequest request,Principal principal){
		List<Student> temp=studentService.findAll();
		return temp;
	}

	@RequestMapping(value = "/getbygroup", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Student>  studentAll(@RequestBody Groupp groupp){
		List<Student> temp=studentService.getAllByGroupp(groupp.getId());
		return temp;
	}
	@RequestMapping(value = "/addStudent", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void>   studentAll(@RequestBody Student student){

		studentService.save(student);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
