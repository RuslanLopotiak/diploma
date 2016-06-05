package com.diplom.dao;

import com.diplom.model.Teather;

public interface TeatherDao extends BaseDao<Teather	, Integer> {

	public Teather findByEmail(String email);
}
