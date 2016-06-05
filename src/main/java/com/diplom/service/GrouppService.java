package com.diplom.service;

import java.util.List;

import com.diplom.model.Groupp;


public interface GrouppService {

	Groupp findById(int id);
	
	List<Groupp> findAll();
	
	void save(Groupp entity);
	
	public void save(String groupName, String facult);


	void remove(Groupp entity);

	void update(Groupp entity);

}
