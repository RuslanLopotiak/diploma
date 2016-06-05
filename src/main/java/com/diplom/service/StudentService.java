package com.diplom.service;

import java.util.List;

import com.diplom.DTO.StudentDTO;
import com.diplom.model.Student;

public interface StudentService {

	public Student searchByName(String name);

	Student findById(int id);

	List<Student> findAll();

	void save(Student entity);

	void remove(Student entity);

	void update(Student entity);

	public void saveDTO(StudentDTO studentDTO);

	public List<Student> getAllByGroupp(int id);

	public Student findByEmail(String email);
}
