package com.diplom.dao;

import java.util.List;

import com.diplom.model.Student;

public interface StudentDao extends BaseDao<Student,Integer> {

	public Student findByEmail(String email);
}
