package com.dillo.hibernateuser.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dillo.hibernateuser.model.User;

public class UserService {

	public void createUserTable() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session =factory.openSession();
		Transaction t = session.beginTransaction();
		
		User user = new User();
		t.commit();
		System.out.println("succesfully created users table");
		factory.close();
		session.close();
		
	}
	public void createUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session =factory.openSession();
		Transaction t = session.beginTransaction();
		
		User uOne = new User();
		uOne.setEmail("hassebe@gmail.com");
		uOne.setFullname("Moh Haseeb");
		uOne.setPassword("has123");
		uOne.setSalary(2000.99);
		uOne.setAge(20);
		uOne.setCity("NYC");
		
		User uTwo = new User();
		
		uTwo.setEmail("james@gmail.com");
		uTwo.setFullname("james Santana");
		uTwo.setPassword("james123");
		uTwo.setSalary(2060.69);
		uTwo.setAge(25);
		uTwo.setCity("Dallas");
		
		User uThree = new User();
		uThree.setEmail("Shahparan@gmail.com");
		uThree.setFullname("AH Shahparan");
		uThree.setPassword("Shahparan123");
		uThree.setSalary(3060.69);
		uThree.setAge(30);
		uThree.setCity("Chicago");
		
		User uFour = new User("Christ","christ@gmail.com","12345",35,3500.00,"Atlanta");
		User uFive = new User("Sid", "sid@gmail.com","4567",25,4000.00,"Louisville");
		
		session.persist(uOne);
		session.persist(uTwo);
		session.persist(uThree);
		session.persist(uFour);
		session.persist(uFive);
		
		t.commit();
		
		System.out.println("Sucessfully Saved");
		factory.close();
		session.close();
	}
}
