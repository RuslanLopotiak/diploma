package com.diplom.service;

import java.util.List;

import com.diplom.model.News;


public interface NewsServise {
	
	News findById(int id);
	
	void save(News entity);

	void remove(News entity);

	void update(News entity);
	
	public List<News> findAll();
}
