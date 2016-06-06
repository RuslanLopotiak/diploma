package com.diplom.service.impl;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.diplom.dao.MessegeDao;
import com.diplom.model.Messege;
import com.diplom.service.MessegeService;

@Service
public class MessegeServiceImpl implements MessegeService {

	@Inject
	private MessegeDao messegeDao;
	@Transactional
	public void update(Messege entity) {
		messegeDao.update(entity);
	}

}
