package com.college.excursion.service;

import java.util.List;

import com.college.excursion.model.Groupp;


public interface GrouppService {

	Groupp findById(int id);
	
	List<Groupp> findAll();
	
	void save(Groupp entity);
	
	void save(String groupName, int groupID, String facult);


	void remove(Groupp entity);

	void update(Groupp entity);

}
