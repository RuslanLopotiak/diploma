package com.diplom.controller;

import java.security.Principal;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.diplom.model.Groupp;
import com.diplom.model.Haract;
import com.diplom.model.Student;
import com.diplom.service.GrouppService;
import com.diplom.service.HaractService;
import com.diplom.service.StudentService;
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
