package com.diplom.DTO;

import javax.persistence.Column;

public class StudentDTO {

	private int id;
	private String email;
	private String password;
	private String name;
	private String sname;
	private int age;
	private String groupId;
	
	
	public StudentDTO() {
	}
	
	
	public StudentDTO(int id, String email, String password, String name, String sname, int age, String groupId) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.sname = sname;
		this.age = age;
		this.groupId = groupId;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	 
	
}
