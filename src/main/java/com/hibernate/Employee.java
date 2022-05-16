package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
// this annotation is used to create/map Employee table .
public class Employee {

	@Id                             // Id is primary key 
	@GeneratedValue(strategy = GenerationType.IDENTITY)        // id is automatic generated and through which it is also assigned to address .
	private Long id;
	private String firstName;
	private String lastName;
	
	@OneToOne(cascade =  CascadeType.ALL)								// OneToOne (unidirectional) relationship  employee table contains address field (be default address primary key i.e id) 
	//@JoinColumn(name ="ADD_ID")      		// JoinColumn is used to customise column name.
	@PrimaryKeyJoinColumn
	private Address address;          	 	// employee entity contain address id 
											// address_id column is added into employee table
											// cascade =  cascadeType.ALL is used for shared primary key ie id both uses same id. 1-1 
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
