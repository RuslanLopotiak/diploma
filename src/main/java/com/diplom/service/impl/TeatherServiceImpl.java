package com.diplom.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.diplom.dao.TeatherDao;
import com.diplom.model.Teather;
import com.diplom.service.TeatherService;


@Service
public class TeatherServiceImpl implements TeatherService{

	@Inject
	private TeatherDao teatherDao;
	
	@Override
	public Teather findById(int id) {
		return teatherDao.findById(id);
	}

	@Override
	public List<Teather> findAll() {
		
		return teatherDao.findAll();
	}

	@Override
	public void save(Teather entity) {
		teatherDao.save(entity);
		
	}

	@Override
	public void remove(Teather entity) {
		teatherDao.remove(entity);
		
	}

	@Override
	public void update(Teather entity) {
		teatherDao.update(entity);
		
	}



}
