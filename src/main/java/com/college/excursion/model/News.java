package com.college.excursion.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PrePersist;


public class News {
	@Id
	@GeneratedValue
	private int id;
	private String title;
	@Lob
	private String textNews;
	private Date time;
	
	public News() {
	
	}
	

	public News(int id, String title, String textNews, Date time) {
		super();
		this.id = id;
		this.title = title;
		this.textNews = textNews;
		this.time = time;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTextNews() {
		return textNews;
	}

	public void setTextNews(String textNews) {
		this.textNews = textNews;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	} 
	
	@PrePersist
	protected void OnCreate(){
		time = new Date();
	}
	
	
	
}
