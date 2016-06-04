package com.college.excursion.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Teather {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String sname;
	private int age;
	private String passport;
	@OneToOne(fetch = FetchType.EAGER)
	Haract haract;
	@OneToOne( fetch=FetchType.EAGER)
	private Dialog	dialog ;

	public Teather() {

	}

	public Teather(int id, String name, String sname, int age, String passport, Haract haract, Dialog dialog) {
		super();
		this.id = id;
		this.name = name;
		this.sname = sname;
		this.age = age;
		this.passport = passport;
		this.haract = haract;
		this.dialog = dialog;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public Haract getHaract() {
		return haract;
	}

	public void setHaract(Haract haract) {
		this.haract = haract;
	}

	public Dialog getDialog() {
		return dialog;
	}

	public void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}

	
}
