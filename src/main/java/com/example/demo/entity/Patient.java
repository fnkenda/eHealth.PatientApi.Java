package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {

	@Id
	int idPatient;
	String name;
	String eMail;
	String tel;
	
	public Patient() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int idPatient, String name, String eMail, String tel) {
		//super();
		this.idPatient = idPatient;
		this.name = name;
		this.eMail = eMail;
		this.tel = tel;
	}

	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Patient [idPatient=" + idPatient + ", name=" + name + ", eMail=" + eMail + ", tel=" + tel + "]";
	}
	
	
}
