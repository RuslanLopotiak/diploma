package com.college.excursion.dao.impl;

import org.springframework.stereotype.Repository;

import com.college.excursion.dao.GrouppDao;
import com.college.excursion.dao.StudentDao;
import com.college.excursion.model.Groupp;
import com.college.excursion.model.Student;
@Repository
public class StudentDaoImp extends BaseDaoImpl<Student, Integer> implements StudentDao{

	public StudentDaoImp() {
		super(Student.class);
		// TODO Auto-generated constructor stub
	}

}
