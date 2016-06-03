package com.college.excursion.dao.impl;

import org.springframework.stereotype.Repository;

import com.college.excursion.dao.BaseDao;
import com.college.excursion.dao.GrouppDao;
import com.college.excursion.model.Groupp;
@Repository
public class GrouppDaoImp extends BaseDaoImpl<Groupp, Integer> implements GrouppDao {

	public GrouppDaoImp() {
		super(Groupp.class);
	}

}
