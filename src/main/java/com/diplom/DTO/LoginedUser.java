package com.diplom.DTO;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.diplom.model.Student;
import com.diplom.model.Teather;
import com.diplom.service.StudentService;
import com.diplom.service.TeatherService;

public class LoginedUser {

	public static UserDTO loginedUser;

}