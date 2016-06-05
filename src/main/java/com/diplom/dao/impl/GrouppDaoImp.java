package com.diplom.dao.impl;

import org.springframework.stereotype.Repository;

import com.diplom.dao.BaseDao;
import com.diplom.dao.GrouppDao;
import com.diplom.model.Groupp;
@Repository
public class GrouppDaoImp extends BaseDaoImpl<Groupp, Integer> implements GrouppDao {

	public GrouppDaoImp() {
		super(Groupp.class);
	}

}
