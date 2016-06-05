package com.diplom.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Messege {
	@Id
	@GeneratedValue
	private int id;
	private String title;
	@Lob
	private String textMes;
	private boolean ansver;
	private boolean checkMes;
	@ManyToOne(fetch= FetchType.LAZY , cascade = CascadeType.ALL)
	private Dialog dialog	;

	
	
	public Messege() {
	
	}



	public Messege(int id, String title, String textMes, boolean ansver, boolean checkMes, Dialog dialog) {
		super();
		this.id = id;
		this.title = title;
		this.textMes = textMes;
		this.ansver = ansver;
		this.checkMes = checkMes;
		this.dialog = dialog;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getTextMes() {
		return textMes;
	}



	public void setTextMes(String textMes) {
		this.textMes = textMes;
	}



	public boolean isAnsver() {
		return ansver;
	}



	public void setAnsver(boolean ansver) {
		this.ansver = ansver;
	}



	public boolean isCheckMes() {
		return checkMes;
	}



	public void setCheckMes(boolean checkMes) {
		this.checkMes = checkMes;
	}



	public Dialog getDialog() {
		return dialog;
	}



	public void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}



}
