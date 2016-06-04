package com.college.excursion.dao;

import com.college.excursion.model.Teather;

public interface TeatherDao extends BaseDao<Teather	, Integer> {

	public Teather findByEmail(String email);
}
