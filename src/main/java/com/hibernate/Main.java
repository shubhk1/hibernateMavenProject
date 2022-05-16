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
		
		
		Address address1 = new Address();
		address1.setId(101L);		
		address1.setStreet("Tajganj");
		address1.setCity("Agra");
		
		Address address2 =new Address();
		address2.setId(102L);		
		address2.setStreet("gokul");
		address2.setCity("Mathura");
		
		List<Address> addressList = Arrays.asList(address1,address2);
		
		Employee employee = new Employee();
		
		employee.setFirstName("Shubham");
		employee.setLastName("kushwah");
	//	employee.setAddress(addressList);
		
			
		 EntityManager factory =   EntityManagerUtil.getEntityManager();          
		 factory.getTransaction().begin();
	
		 factory.persist(employee);       // saving data into employee table
		address1.setEmployee(employee);
		address2.setEmployee(employee);
		 factory.persist(address1);
		 factory.persist(address2);
		 factory.getTransaction().commit();
		 factory.close();
			      

	}

}
