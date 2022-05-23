package com.ty.school;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id ;
	private String name ;
	private double percentsge ;
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
	public double getPercentsge() {
		return percentsge;
	}
	public void setPercentsge(double percentsge) {
		this.percentsge = percentsge;
	}
	
	
}
