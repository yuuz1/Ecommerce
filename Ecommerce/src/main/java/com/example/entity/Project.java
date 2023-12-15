package com.example.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {
@Id
	
	private int id;
	private String proname;
	private int proamt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getProamt() {
		return proamt;
	}
	public void setProamt(int proamt) {
		this.proamt = proamt;
	}
	public Project(int id, String proname, int proamt) {
		super();
		this.id = id;
		this.proname = proname;
		this.proamt = proamt;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
}
