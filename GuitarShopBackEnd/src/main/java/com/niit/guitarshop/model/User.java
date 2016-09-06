package com.niit.guitarshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "user")
@Component
public class User {

	@Id
	@Column(name="id")
	private String id;
	@Column(name="pass")
	private String pass;	
	@Column(name = "admin")
	private boolean isAdmin;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	public String getPass() {
		return pass;
	}
	public void setPassword(String pass) {
		this.pass = pass;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

}
