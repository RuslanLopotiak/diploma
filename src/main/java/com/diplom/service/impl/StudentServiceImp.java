package com.diplom.service.impl;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.diplom.DTO.StudentDTO;
import com.diplom.dao.GrouppDao;
import com.diplom.dao.StudentDao;
import com.diplom.model.Groupp;
import com.diplom.model.Student;
import com.diplom.service.StudentService;

@Service
public class StudentServiceImp implements StudentService {
	@Inject
	StudentDao studdao;
	@Inject
	GrouppDao grouppDao;

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

	@Transactional
	@Override
	public List<Student> findAll() {
		return studdao.findAll();
	}

	@Transactional
	@Override
	public void save(Student entity) {
		studdao.save(entity);
	}

	@Transactional
	public void saveDTO(StudentDTO studentDTO){		
		Groupp groupp = grouppDao.findById(Integer.parseInt(studentDTO.getGroupId()) );
	 Student student = new Student(studentDTO.getEmail(), studentDTO.getPassword(), studentDTO.getName(), studentDTO.getSname(), studentDTO.getAge(), groupp);
	 save(student);
	}

	@Override
	public void remove(Student entity) {
		studdao.remove(entity);
	}

	@Transactional
	@Override
	public void update(Student entity) {
		studdao.update(entity);
	}

	@Transactional
	public List<Student> getAllByGroupp(int id) {
		List<Student> temp = studdao.findAll();
		List<Student> students = new ArrayList<>();
		for (Student student : temp) {
			if (student.getGroupp().getId() == id) {
				students.add(student);
			}

		}
		return students;

	}

	@Transactional
	public Student findByEmail(String email) {
		List<Student> students = studdao.findAll();
		for (Student temp : students) {
			if (temp.getEmail().equals(email)) {
				return temp;
			}

		}

		return null;
	}

}
