package com.diplom.service;

import java.util.List;

import com.diplom.model.Teather;

public interface TeatherService {
	

	Teather findById(int id);

	List<Teather> findAll();

	void save(Teather entity);

	void remove(Teather entity);

	void update(Teather entity);
}
