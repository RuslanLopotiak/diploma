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
import com.college.excursion.service.GrouppService;
@Controller
public class GrouppComtroller {

	@RequestMapping(value = { "/group"}, method = RequestMethod.GET)
	public String groups(Model model, HttpServletRequest request,Principal principal){
		return "group";
	}
	@Inject 
	GrouppService grouppService;

		@RequestMapping(value = { "/group/getAll"}, method = RequestMethod.GET)
		public @ResponseBody List<Groupp>  groupAll(){
			List<Groupp> temp=grouppService.findAll();
			return temp;
		}
		
		@RequestMapping(value = "/group/save", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Void> createUser(@RequestBody Groupp groupp) {

			grouppService.save(groupp);
			return new ResponseEntity<>(HttpStatus.OK);

		}
}
