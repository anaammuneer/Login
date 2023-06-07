package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavedPerson {

	public static void main(String[] args) {
		Person person = new Person();
		person.setId(1);
		person.setName("Shiak");
		person.setAge(21);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("god");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (person != null) {
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			System.out.println("data saved");
		}

	}

}
