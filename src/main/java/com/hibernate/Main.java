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
		employee.setId(1L);
		employee.setFirstName("Shubham");
		employee.setLastName("kushwah");
		
					
		Address address = new Address();
		address.setId(101L);		
		address.setStreet("Tajganj");
		address.setCity("Agra");
		
		employee.setAddress(address);
			
		 EntityManager factory =   EntityManagerUtil.getEntityManager();          
		 factory.getTransaction().begin();
		 factory.persist(employee);       // saving data into employee table
		 factory.persist(address);        // saving data into address table
		 
	 
		 factory.getTransaction().commit();
		 factory.close();
			      

	}

}
