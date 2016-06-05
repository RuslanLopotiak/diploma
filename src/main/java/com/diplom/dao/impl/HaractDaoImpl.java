package com.diplom.dao.impl;

import org.springframework.stereotype.Repository;

import com.diplom.dao.GrouppDao;
import com.diplom.dao.HaractDao;
import com.diplom.model.Groupp;
import com.diplom.model.Haract;
@Repository
public class HaractDaoImpl extends BaseDaoImpl<Haract,Integer> implements HaractDao {

	public HaractDaoImpl() {
		super(Haract.class);
	}
	

}
