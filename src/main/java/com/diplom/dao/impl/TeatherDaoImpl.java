package com.diplom.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.diplom.dao.TeatherDao;
import com.diplom.model.Student;
import com.diplom.model.Teather;

@Repository
public class TeatherDaoImpl extends BaseDaoImpl<Teather	, Integer> implements TeatherDao {

	public TeatherDaoImpl() {
		super(Teather.class);
		
	}

	@Transactional
	public Teather findByEmail(String email){
		List<Teather> teathers = findAll();
		for (Teather temp : teathers) {
			if (temp.getEmail().equals(email)) {
				return temp;
			}
		}
		return null;
		
	}
}
