package com.diplom.controller;

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

import com.diplom.DTO.GrouppDTO;
import com.diplom.DTO.LoginedUser;
import com.diplom.model.Groupp;
import com.diplom.model.Messege;
import com.diplom.model.Student;
import com.diplom.model.Teather;
import com.diplom.service.MessegeService;
import com.diplom.service.StudentService;
import com.diplom.service.TeatherService;
import com.diplom.service.UserService;

@Controller
public class MessegeController {

	@Inject
	private UserService userService;
	@Inject
	private StudentService studentService;
	@Inject
	private TeatherService teatherService;
	@Inject
	private MessegeService messegeService;

	@RequestMapping(value = { "/messege" }, method = RequestMethod.GET)
	public String messege(Model model, HttpServletRequest request) {

		return "messege";
	}

	@RequestMapping(value = { "/answerMessege/getNotAnswerStudent" }, method = RequestMethod.GET)
	public @ResponseBody List<Student> getNotAnswerStudent() {

		return studentService.getNotAnswerStudent();
	}

	@RequestMapping(value = "/answerMessege/getStudentMessege", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Messege> deleteUser(@RequestBody GrouppDTO grouppDTO) {

		Student student = studentService.findById(Integer.parseInt(grouppDTO.getId()));
		List<Messege> messeges = student.getDialog().getMesseges();
		List<Messege> messegesnew = new ArrayList<>();
		for (Messege messege : messeges) {
			if (!messege.isCheckMes()) {
				messege.setCheckMes(true);
				messegeService.update(messege);
			}
		}
		return student.getDialog().getMesseges();

	}

	@RequestMapping(value = {
			"/answerMessege/add" }, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> addMessegeAdminForStudent(@RequestBody GrouppDTO GrouppDTO) {
		Student student = studentService.findById(Integer.parseInt(GrouppDTO.getId()));
		List<Messege> messeges = student.getDialog().getMesseges();
		messeges.add(new Messege(GrouppDTO.getTextMes(), true, true, student.getDialog()));
		student.getDialog().setMesseges(messeges);
		studentService.update(student);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = { "/answerMessege/getNotAnswerTeathers" }, method = RequestMethod.GET)
	public @ResponseBody List<Teather> getNotAnswerTeathers() {

		return teatherService.getNotAnswerTeather();
	}

	@RequestMapping(value = { "/answerMessege" }, method = RequestMethod.GET)
	public String answerMessege(Model model, HttpServletRequest request) {

		return "answerMessege";
	}

	@RequestMapping(value = { "/messege/getAll" }, method = RequestMethod.GET)
	public @ResponseBody List<Messege> messegeAll() {
		return LoginedUser.loginedUser.getDialog().getMesseges();

	}

	@RequestMapping(value = {
			"/messege/add" }, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> addMessegeUser(@RequestBody Messege messege) {

		List<Messege> messeges = LoginedUser.loginedUser.getDialog().getMesseges();
		messeges.add(new Messege(messege.getTextMes(), false, false, LoginedUser.loginedUser.getDialog()));
		LoginedUser.loginedUser.getDialog().setMesseges(messeges);
		userService.save();
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
