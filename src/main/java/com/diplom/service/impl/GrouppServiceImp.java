package com.diplom.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.diplom.dao.GrouppDao;
import com.diplom.model.Groupp;
import com.diplom.service.GrouppService;

@Service
public class GrouppServiceImp implements GrouppService {

	@Inject
	GrouppDao grpdao;

	@Override
	public Groupp findById(int id) {
		return grpdao.findById(id);
	}

	@Override
	public List<Groupp> findAll() {
		// TODO Auto-generated method stub
		return grpdao.findAll();
	}

	@Override
	public void save(Groupp entity) {
		grpdao.save(entity);
	}

	@Transactional
	@Override
	public void save(String groupName, String facult) {
		Groupp temp = new Groupp();
		temp.setFacult(facult);
		;
		grpdao.save(temp);
	}

	@Override
	public void remove(Groupp entity) {
		grpdao.remove(entity);
	}

	@Override
	public void update(Groupp entity) {
		grpdao.update(entity);
	}

}
