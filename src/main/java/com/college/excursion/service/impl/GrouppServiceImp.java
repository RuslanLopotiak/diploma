package com.college.excursion.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.college.excursion.dao.GrouppDao;
import com.college.excursion.model.Groupp;
import com.college.excursion.service.GrouppService;

@Service
public class GrouppServiceImp implements GrouppService{

	@Inject
GrouppDao grpdao;

	

	@Override
	public Groupp findById(int id) {
	return grpdao.findById(id);
	}
	@Transactional
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
	public void save(String groupName, int groupID, String facult) {
		Groupp temp=new Groupp();
		temp.setGroupID(groupID);
		temp.setFacult(facult);;
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
