package com.diplom.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;

@Entity
public class Groupp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String groupName;
	private String facult;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "groupp", cascade = CascadeType.ALL)
	private List<Student> students;

	public Groupp() {
	}


	
	

	public Groupp(int id, String groupName, String facult, List<Student> students) {
		super();
		this.id = id;
		this.groupName = groupName;
		this.facult = facult;
		this.students = students;
	}





	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public String getFacult() {
		return facult;
	}

	public void setFacult(String facult) {
		this.facult = facult;
	}
	
	@PrePersist
	protected void OnCreate(){
		this.students = new ArrayList<>();
	}


}