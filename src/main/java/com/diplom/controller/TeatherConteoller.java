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
import com.diplom.model.Haract;
import com.diplom.model.Student;
import com.diplom.model.Teather;
import com.diplom.service.TeatherService;

@Controller
@RequestMapping(value = { "/teathers" })
public class TeatherConteoller {
	
	@Inject
	private TeatherService teatherService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String teathers(Model model, HttpServletRequest request, Principal principal) {
		return "teathers";
	}
	@RequestMapping(value = { "/getAll"}, method = RequestMethod.GET)
	public @ResponseBody List<Teather>  studentAll(Model model, HttpServletRequest request,Principal principal){
		List<Teather> temp=teatherService.findAll();
		return temp;
		
	}
	
	@RequestMapping(value = { "/getHaractRes"}, method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Haract  getHaractRes(@RequestBody GrouppDTO grouppDTO){
		Teather teather = teatherService.findById(Integer.parseInt(grouppDTO.getId()));

		return teather.getHaract();
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteUser(@RequestBody GrouppDTO grouppDTO) {
		
	Teather teather = teatherService.findById(Integer.parseInt(grouppDTO.getId()));

		teatherService.remove(teather);
		return new ResponseEntity<>(HttpStatus.OK);

	}
}
