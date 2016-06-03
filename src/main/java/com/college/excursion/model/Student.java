package com.college.excursion.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({ @NamedQuery(name = Student.FIND_BY_NAME, query = "SELECT e FROM Student e WHERE e.name = :name") })
public class Student {

	public static final String FIND_BY_NAME = "Student.findByName";
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String sname;
	private int age;
	private String passport;

	private int group_ID;
	@OneToOne( fetch=FetchType.EAGER)
	Haract haract;

	
	public Student() {	
	}


	public Student(String name, String sname, int age, String passport, int group_ID) {
		super();
		this.name = name;
		this.sname = sname;
		this.age = age;
		this.passport = passport;
		this.group_ID = group_ID;
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


	public int getGroup_ID() {
		return group_ID;
	}


	public void setGroup_ID(int group_ID) {
		this.group_ID = group_ID;
	}


	
	
	
}
