package com.diplom.controller;

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
import org.springframework.web.bind.annotation.ResponseBody;

import com.diplom.DTO.GrouppDTO;
import com.diplom.DTO.LoginedUser;
import com.diplom.model.Haract;
import com.diplom.model.Student;
import com.diplom.model.Teather;
import com.diplom.service.StudentService;
import com.diplom.service.TeatherService;
import com.diplom.service.UserService;

@Controller
public class TestController {

	@Inject
	private StudentService studentService;
	@Inject
	private TeatherService teatherService;
	@Inject
	private UserService userService;
	@RequestMapping(value = {  "/test" }, method = RequestMethod.GET)
	public String test(Model model, HttpServletRequest request) {

		return "test";
	}
	@RequestMapping(value = "/test/get", method = RequestMethod.GET)
	public @ResponseBody Haract getHaract(Principal principal, Model model,
			HttpServletRequest request) {

		return LoginedUser.loginedUser.getHaract();
	
	}
	@RequestMapping(value = { "/getHaractRes"}, method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Haract  getHaractRes(@RequestBody GrouppDTO grouppDTO){
		Teather teather = teatherService.findById(Integer.parseInt(grouppDTO.getId()));

		return teather.getHaract();
	}
	@RequestMapping(value = {  "/testkomun" }, method = RequestMethod.GET)
	public String testkomun(Model model, HttpServletRequest request) {

		return "testkomun";
	}
	@RequestMapping(value = {  "/testnaviv" }, method = RequestMethod.GET)
	public String testnaviv(Model model, HttpServletRequest request) {

		return "testnaviv";
	}
	@RequestMapping(value = {  "/teststres" }, method = RequestMethod.GET)
	public String teststres(Model model, HttpServletRequest request) {

		return "teststres";
	}
	@RequestMapping(value = {  "/testtemper" }, method = RequestMethod.GET)
	public String testtemper(Model model, HttpServletRequest request) {

		return "testtemper";
	}
	@RequestMapping(value = { "/testtemper/save"}, method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> getHaractTemper(@RequestBody Haract	haract ){
		 LoginedUser.loginedUser.getHaract().setTemper(haract.getTemper());
		 userService.save();
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@RequestMapping(value = { "/teststres/save"}, method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> getHaractStres(@RequestBody  Haract	haract ){
		LoginedUser.loginedUser.getHaract().setStres(haract.getStres());
		userService.save();
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@RequestMapping(value = { "/testnaviv/save"}, method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> getHaractNaviv(@RequestBody  Haract	haract ){
		LoginedUser.loginedUser.getHaract().setNaviv(haract.getNaviv());
		userService.save();
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@RequestMapping(value = { "/testkomun/save"}, method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> getHaractKomun(@RequestBody  Haract	haract ){
		 LoginedUser.loginedUser.getHaract().setKomun(haract.getKomun());
		 userService.save();
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
