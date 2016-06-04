package com.college.excursion.dao.impl;

import org.springframework.stereotype.Repository;

import com.college.excursion.dao.MessegeDao;
import com.college.excursion.model.Messege;

@Repository
public class MessegeDaoImpl extends BaseDaoImpl<Messege, Integer> implements MessegeDao {

	public MessegeDaoImpl( ) {
		super(Messege.class);
	}

}
