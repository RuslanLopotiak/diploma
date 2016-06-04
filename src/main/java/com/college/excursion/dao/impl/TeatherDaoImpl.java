package com.college.excursion.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.college.excursion.dao.TeatherDao;
import com.college.excursion.model.Student;
import com.college.excursion.model.Teather;

@Repository
public class TeatherDaoImpl extends BaseDaoImpl<Teather	, Integer> implements TeatherDao {

	public TeatherDaoImpl() {
		super(Teather.class);
		
	}

	@Transactional
	public Teather findByEmail(String email){
		List<Teather> teathers = findAll();
		for (Teather temp : teathers) {
			if (temp.getEmail() == email) {
				return temp;
			}
		}
		return null;
		
	}
}
