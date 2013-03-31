package com.springjpa.trial.lesson01.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	private int id;
	private String name;
	private String pasw;
	
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
	public String getPasw() {
		return pasw;
	}
	public void setPasw(String pasw) {
		this.pasw = pasw;
	}
}
