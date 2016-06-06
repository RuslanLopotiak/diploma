package com.diplom.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.diplom.dao.TeatherDao;
import com.diplom.model.Messege;
import com.diplom.model.Student;
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

	@Override
	public List<Teather> getNotAnswerTeather() {
		int count;
		List<Teather> teathersresult = new ArrayList<>();
		List<Teather> teathers = teatherDao.findAll();
		for (Teather teather : teathers) {
			count = 0;
			for (Messege messege : teather.getDialog().getMesseges()) {
				if(count == 0)
				if(!messege.isCheckMes()){
					teathersresult.add(teather);
					count ++;
				}
			}
		}
		return teathersresult;
	}

  

}
