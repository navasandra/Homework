package com.demo.demo.model;

import javax.validation.constraints.NotBlank;

public class Customer {
	@NotBlank(message = "Name is mandatory")
	private String name;
	
	@NotBlank(message = "Surname is mandatory")
	private String surname;
	
	@NotBlank(message = "Birth date is mandatory")
	private String birthDate;
	
	@NotBlank(message = "Phone number is mandatory")
	private String phone;
	
	@NotBlank(message = "Email is mandatory")
	private String email;


	public Customer(String name, String surname, String birthDate, String phone, String email) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBirthDate() {
	return birthDate;
	}
	public void BirthDate(String birthDate) {
	this.birthDate = birthDate;
	}
	public String getPhone() {
	return phone;
	}
	public void setPhone(String phone) {
	this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
