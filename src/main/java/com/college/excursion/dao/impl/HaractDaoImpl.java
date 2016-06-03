package com.college.excursion.dao.impl;

import org.springframework.stereotype.Repository;

import com.college.excursion.dao.GrouppDao;
import com.college.excursion.dao.HaractDao;
import com.college.excursion.model.Groupp;
import com.college.excursion.model.Haract;
@Repository
public class HaractDaoImpl extends BaseDaoImpl<Haract,Long> implements HaractDao {

	public HaractDaoImpl() {
		super(Haract.class);
	}
	

}
