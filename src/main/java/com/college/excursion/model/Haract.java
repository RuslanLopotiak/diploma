package com.college.excursion.model;



import java.util.Calendar;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;


@Entity
public class Haract {

	@Id
	@GeneratedValue
	private int id;
	private int Iq;
	private String temper;
	private String socium;
	private String uvaga;
	private String mozok;


	public Haract() {
	}

	public Haract(int iq, String temper, String socium, String uvaga, String mozok) {
		super();
		this.Iq = iq;
		this.temper = temper;
		this.socium = socium;
		this.uvaga = uvaga;
		this.mozok = mozok;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIq() {
		return Iq;
	}

	public void setIq(int iq) {
		Iq = iq;
	}

	public String getTemper() {
		return temper;
	}

	public void setTemper(String temper) {
		this.temper = temper;
	}

	public String getSocium() {
		return socium;
	}

	public void setSocium(String socium) {
		this.socium = socium;
	}

	public String getUvaga() {
		return uvaga;
	}

	public void setUvaga(String uvaga) {
		this.uvaga = uvaga;
	}

	public String getMozok() {
		return mozok;
	}

	public void setMozok(String mozok) {
		this.mozok = mozok;
	}

	
	

}
