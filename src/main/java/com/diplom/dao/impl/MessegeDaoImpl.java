package com.diplom.dao.impl;

import org.springframework.stereotype.Repository;

import com.diplom.dao.MessegeDao;
import com.diplom.model.Messege;

@Repository
public class MessegeDaoImpl extends BaseDaoImpl<Messege, Integer> implements MessegeDao {

	public MessegeDaoImpl( ) {
		super(Messege.class);
	}

}
