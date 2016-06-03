package com.college.exursion.service;

import java.util.List;

import com.college.excursion.model.Haract;

public interface HaractService {
	
	public Haract searchByName(String name);
	Haract findById(long id);
	
	List<Haract> findAll();
	
	void save(Haract entity);
	
	void save(int iq, String temper, String socium, String uvaga, String mozok);


	void remove(Haract entity);

	void update(Haract entity);

}
