package com.diplom.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student {


	@Id
	@GeneratedValue
	private int id;
	private String email;
	private String password;
	private String name;
	private String sname;
	@Column( columnDefinition = "int default 0")
	private int age;
	@ManyToOne(fetch = FetchType.LAZY)
	private Groupp groupp;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Haract haract;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Dialog dialog;

	public Student() {
	}

	public Student( String email, String password, String name, String sname, int age, Groupp groupp) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.sname = sname;
		this.age = age;
		this.groupp = groupp;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
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

	@JsonIgnore
	public Groupp getGroupp() {
		return groupp;
	}
	
	public void setGroupp(Groupp groupp) {
		this.groupp = groupp;
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
	@PrePersist
	protected void onCreate(){
		this.dialog = new Dialog();
		this.haract = new Haract();
	}
}
