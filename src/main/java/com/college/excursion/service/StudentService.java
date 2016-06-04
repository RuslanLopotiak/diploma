package com.college.excursion.service;

import java.util.List;

import com.college.excursion.model.Student;

public interface StudentService {

	public Student searchByName(String name);

	Student findById(int id);

	List<Student> findAll();

	void save(Student entity);

	void remove(Student entity);

	void update(Student entity);

	public List<Student> getAllByGroupp(int id);

	public Student findByEmail(String email);
}
