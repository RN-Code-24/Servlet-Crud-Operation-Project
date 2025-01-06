package com.jsp.servlet_simple_crud_operation.entity;

import java.time.LocalDate;
import java.util.Objects;

public class User {
	
	private int id;
	private String name;
	private String email;
	private String password;
	private LocalDate dob;
	private String gender;
	
	
	
	public User() {
		super();
		
	}



	public User(int id, String name, String email, String password, LocalDate dob, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
	}



	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



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



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", dob=" + dob
				+ ", gender=" + gender + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(dob, email, gender, id, name, password);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(email, other.email)
				&& Objects.equals(gender, other.gender) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}

	
	
	
	
	
	
	
	
	

}
