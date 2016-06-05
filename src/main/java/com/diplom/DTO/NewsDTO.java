package com.diplom.DTO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

public class NewsDTO {

	private int id;
	private String title;
	private String textNews;
	private String time;
	
	public NewsDTO(int id, String title, String textNews, Date time) {
		super();
		this.id = id;
		this.title = title;
		this.textNews = textNews;
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		this.time  = df.format(time);
	}
	public NewsDTO() {
		
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
	public String getTime() {
		return time;
	}
	public void setTime(Date time) {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		this.time  = df.format(time);
	}
	
	
}
