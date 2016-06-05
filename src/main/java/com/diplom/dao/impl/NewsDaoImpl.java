package com.diplom.dao.impl;

import org.springframework.stereotype.Repository;

import com.diplom.dao.NewsDao;
import com.diplom.model.News;

@Repository
public class NewsDaoImpl extends BaseDaoImpl<News, Integer> implements NewsDao {

	public NewsDaoImpl() {
		super(News.class);
	
	}

}
