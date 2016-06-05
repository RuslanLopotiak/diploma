package com.diplom.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dialog {
	
	@Id
	@GeneratedValue
	private int id;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "dialog")
	private List<Messege> messeges;
	public Dialog() {
		
	}
	public Dialog(int id, List<Messege> messeges) {

		this.id = id;
		this.messeges = messeges;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Messege> getMesseges() {
		return messeges;
	}
	public void setMesseges(List<Messege> messeges) {
		this.messeges = messeges;
	}
	

}
