package com.college.exursion.service;

import java.util.List;


import com.college.excursion.model.Student;

public interface StudentService {

	public Student searchByName(String name);
	Student findById(int id);
	
	List<Student> findAll();
	
	void save(Student entity);
	
	void save(String name, String sname, int age, String passport, int group_ID);


	void remove(Student entity);

	void update(Student entity);
}
