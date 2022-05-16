package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
// this annotation is used to create/map Address table
public class Address {

	@Id
	private Long id; 					 // Id is primary key
	private String street;
	private String city;

	@ManyToOne								// internally join column is used . 
	private Employee employee;            // we have to use this annotation in both classes to  make OneToOne bidirectional

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city
				+ "]";
	}

}
