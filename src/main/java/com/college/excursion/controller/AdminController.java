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
import com.college.excursion.service.GrouppService;
import com.college.excursion.service.HaractService;
import com.college.excursion.service.StudentService;
@Controller

public class AdminController {
	
	@RequestMapping(value = { "/admin"}, method = RequestMethod.GET)
	public String general(Model model, HttpServletRequest request,Principal principal){
		return "admin";
	}


	@RequestMapping(value = { "/haract"}, method = RequestMethod.GET)
	public String haract(Model model, HttpServletRequest request,Principal principal){
		
		return "haract";
	}

@Inject 
HaractService harserv;
@Inject 
StudentService studserv;

	@RequestMapping(value = { "/haract/getAll"}, method = RequestMethod.GET)
	public @ResponseBody List<Haract>  haractAll(Model model, HttpServletRequest request,Principal principal){
		List<Haract> temp=harserv.findAll();
		return temp;
	}

	
}
