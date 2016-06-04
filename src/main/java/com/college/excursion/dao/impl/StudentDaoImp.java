package com.college.excursion.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

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

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
