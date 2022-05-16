package com.hibernate;

import java.util.Arrays;


import java.util.List;

import javax.persistence.EntityManager;
/*
import com.hibernate.manytomany.Mobile;
import com.hibernate.manytomany.Person;
*/
public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		employee.setFirstName("Shubham");
		employee.setLastName("kushwah");
		
		Address address = new Address();
			
		address.setStreet("Tajganj");
		address.setCity("Agra");
			
		 EntityManager factory =   EntityManagerUtil.getEntityManager();          
		 factory.getTransaction().begin();
		 factory.persist(employee);       // saving data into employee table
		 
		 address.setId(employee.getId());     // getting id from employee and setting into address 
		 employee.setAddress(address);        // 
		 
		 factory.persist(address);        // saving data into address table
		 
		 factory.persist(employee); 
	 
		 factory.getTransaction().commit();
		 factory.close();
			      

	}

}
