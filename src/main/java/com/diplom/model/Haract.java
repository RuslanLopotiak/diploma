package com.diplom.model;



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
	private String komun;
	private String naviv;
	private String stres;
	private String temper;
	
	
	public Haract() {
	}
	
	
	public Haract(int id, String komun, String naviv, String stres, String temper) {
		super();
		this.id = id;
		this.komun = komun;
		this.naviv = naviv;
		this.stres = stres;
		this.temper = temper;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKomun() {
		return komun;
	}
	public void setKomun(String komun) {
		this.komun = komun;
	}
	public String getNaviv() {
		return naviv;
	}
	public void setNaviv(String naviv) {
		this.naviv = naviv;
	}
	public String getStres() {
		return stres;
	}
	public void setStres(String stres) {
		this.stres = stres;
	}
	public String getTemper() {
		return temper;
	}
	public void setTemper(String temper) {
		this.temper = temper;
	}	

}
