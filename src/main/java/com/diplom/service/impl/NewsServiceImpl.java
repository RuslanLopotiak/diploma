package com.diplom.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.diplom.dao.NewsDao;
import com.diplom.model.News;
import com.diplom.service.NewsServise;

@Service
public class NewsServiceImpl implements NewsServise{
	@Inject
	private NewsDao newsDao;
	@Override
	public List<News> findAll() {
		return newsDao.findAll();
	}
	@Override
	public News findById(int id) {
		
		return newsDao.findById(id);
	}
	@Override
	public void save(News entity) {
		newsDao.save(entity);
		
	}
	@Override
	public void remove(News entity) {
		newsDao.remove(entity);
		
	}
	@Override
	public void update(News entity) {
		newsDao.update(entity);
		
	}

}
