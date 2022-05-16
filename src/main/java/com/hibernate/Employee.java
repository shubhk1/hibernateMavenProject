package com.hibernate;

import java.util.List;

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
	
	@OneToMany(mappedBy = "employee")           // we can used only one either joincoloumn or mappedby at one time to join coloumn .no third table is created.
	//@JoinColumn								// add adddress_id column into address table . i.e there is no third table.
//	@JoinColumn(name = "emp_id")
	private List <Address> address;
														
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
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
