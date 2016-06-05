package com.diplom.controller;

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

import com.diplom.DTO.GrouppDTO;
import com.diplom.model.Groupp;
import com.diplom.model.Haract;
import com.diplom.model.Student;
import com.diplom.service.GrouppService;
import com.diplom.service.StudentService;

@Controller
@RequestMapping(value = { "/student" })
public class StudentController {

	@RequestMapping(method = RequestMethod.GET)
	public String student(Model model, HttpServletRequest request, Principal principal) {
		return "student";
	}

	@Inject
	private StudentService studentService;
	@Inject
	private GrouppService grouppService;
	
	@RequestMapping(value = { "/getByGroup"}, method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Student>  groupAll(@RequestBody GrouppDTO grouppDTO){
		Groupp groupp = grouppService.findById(Integer.parseInt(grouppDTO.getId()));
		return groupp.getStudents();
	}
	
	@RequestMapping(value = { "/getHaractRes"}, method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Haract  getHaractRes(@RequestBody GrouppDTO grouppDTO){
		Student student = studentService.findById(Integer.parseInt(grouppDTO.getId()));

		return student.getHaract();
	}
	
	@RequestMapping(value = { "/getAll"}, method = RequestMethod.GET)
	public @ResponseBody List<Student>  studentAll(Model model, HttpServletRequest request,Principal principal){
		List<Student> temp=studentService.findAll();
		return temp;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteUser(@RequestBody GrouppDTO grouppDTO) {
		
		Student student = studentService.findById(Integer.parseInt(grouppDTO.getId()));

		studentService.remove(student);
		return new ResponseEntity<>(HttpStatus.OK);

	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void>   studentAll(@RequestBody Student student){

		studentService.save(student);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
