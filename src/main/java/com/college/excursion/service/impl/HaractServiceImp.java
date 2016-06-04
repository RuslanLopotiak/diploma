package com.college.excursion.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.college.excursion.dao.GrouppDao;
import com.college.excursion.dao.HaractDao;
import com.college.excursion.model.Haract;
import com.college.excursion.service.HaractService;

@Service
public class HaractServiceImp implements HaractService {

	@Inject
	HaractDao haractdao;
	
	
	@Override
	public Haract searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Haract findById(Integer id) {
		// TODO Auto-generated method stub
		return haractdao.findById(id);
	}

	@Override
	public List<Haract> findAll() {
		// TODO Auto-generated method stub
		return haractdao.findAll();
	}

	@Override
	public void save(Haract entity) {
		haractdao.save(entity);
	}

	@Override
	public void save(int iq, String temper, String socium, String uvaga, String mozok) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Haract entity) {
		haractdao.remove(entity);
	}

	@Override
	public void update(Haract entity) {
		haractdao.update(entity);
	}

}
