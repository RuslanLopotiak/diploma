package com.diplom.service;

import java.util.List;

import com.diplom.model.Haract;

public interface HaractService {
	
	public Haract searchByName(String name);
	Haract findById(Integer id);
	
	List<Haract> findAll();
	
	void save(Haract entity);
	
	void save(int iq, String temper, String socium, String uvaga, String mozok);


	void remove(Haract entity);

	void update(Haract entity);

}
