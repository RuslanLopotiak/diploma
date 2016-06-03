package com.college.excursion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Groupp {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String groupName;
	private int groupID;
	private String Facult;
	private int KilkistStud;
public Groupp() {
	// TODO Auto-generated constructor stub
}
	
	public Groupp(String groupName, int groupID, String facult, int kilkistStud) {
		super();
	
		this.groupName = groupName;
		this.groupID = groupID;
		Facult = facult;
		KilkistStud = kilkistStud;
	}
	public int getId() {
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
	public int getGroupID() {
		return groupID;
	}
	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}
	public String getFacult() {
		return Facult;
	}
	public void setFacult(String facult) {
		Facult = facult;
	}
	public int getKilkistStud() {
		return KilkistStud;
	}
	public void setKilkistStud(int kilkistStud) {
		KilkistStud = kilkistStud;
	}

	
}