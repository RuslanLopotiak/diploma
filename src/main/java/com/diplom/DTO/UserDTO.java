package com.diplom.DTO;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import com.diplom.model.Dialog;
import com.diplom.model.Haract;

public class UserDTO {

	private int id;
	private String email;
	private String password;
	private String name;
	private String sname;
	private int age;
	private Haract haract;
	private Dialog dialog;
	private String role;
	
	public UserDTO() {
		
	}
	
	
	
	

	public UserDTO(int id, String email, String password, String name, String sname, int age, Haract haract,
			Dialog dialog, String role) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.sname = sname;
		this.age = age;
		this.haract = haract;
		this.dialog = dialog;
		this.role = role;
	}





	public String getRole() {
		return role;
	}





	public void setRole(String role) {
		this.role = role;
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
	
	

}
