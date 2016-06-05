package com.diplom.controller;

import java.lang.invoke.MethodHandles;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	private static final Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass());

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String login(Model model, HttpServletRequest request) {

		return "login";
	}

}
