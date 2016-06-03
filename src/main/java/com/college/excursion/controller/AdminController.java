package com.college.excursion.controller;

import java.security.Principal;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.college.excursion.model.Groupp;
import com.college.excursion.model.Haract;
import com.college.excursion.model.Student;
import com.college.exursion.service.GrouppService;
import com.college.exursion.service.HaractService;
import com.college.exursion.service.StudentService;
@Controller

public class AdminController {
	
	@RequestMapping(value = { "/admin"}, method = RequestMethod.GET)
	public String general(Model model, HttpServletRequest request,Principal principal){
		return "admin";
	}

	
	@RequestMapping(value = { "/group"}, method = RequestMethod.GET)
	public String groups(Model model, HttpServletRequest request,Principal principal){
		return "group";
	}
	@RequestMapping(value = { "/haract"}, method = RequestMethod.GET)
	public String haract(Model model, HttpServletRequest request,Principal principal){
		
		return "haract";
	}
	@RequestMapping(value = { "/student"}, method = RequestMethod.GET)
	public String student(Model model, HttpServletRequest request,Principal principal){
		return "student";
	}
@Inject 
GrouppService grpserv;
@Inject 
HaractService harserv;
@Inject 
StudentService studserv;
	@RequestMapping(value = { "/group/getAll"}, method = RequestMethod.GET)
	public @ResponseBody List<Groupp>  groupAll(Model model, HttpServletRequest request,Principal principal){
		List<Groupp> temp=grpserv.findAll();
		return temp;
	}
	@RequestMapping(value = { "/haract/getAll"}, method = RequestMethod.GET)
	public @ResponseBody List<Haract>  haractAll(Model model, HttpServletRequest request,Principal principal){
		List<Haract> temp=harserv.findAll();
		return temp;
	}
	@RequestMapping(value = { "/student/getAll"}, method = RequestMethod.GET)
	public @ResponseBody List<Student>  studentAll(Model model, HttpServletRequest request,Principal principal){
		List<Student> temp=studserv.findAll();
		return temp;
	}
	
}
