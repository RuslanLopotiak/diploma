package com.college.excursion.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.college.excursion.dao.GrouppDao;
import com.college.excursion.dao.StudentDao;
import com.college.excursion.model.Student;
import com.college.exursion.service.StudentService;

@Service
public class StudentServiceImp implements StudentService{
	@Inject
StudentDao studdao;
	@Override
	public Student searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studdao.findById(id);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studdao.findAll();
	}

	@Override
	public void save(Student entity) {
		studdao.save(entity);
	}

	@Override
	public void save(String name, String sname, int age, String passport, int group_ID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Student entity) {
		studdao.remove(entity);
	}

	@Override
	public void update(Student entity) {
		studdao.update(entity);
	}

}
