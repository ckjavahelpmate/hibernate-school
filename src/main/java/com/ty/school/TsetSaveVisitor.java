package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TsetSaveVisitor {

	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;

		EntityManager entityManager = entityManagerFactory.createEntityManager() ;

		EntityTransaction entityTransaction = entityManager.getTransaction() ;

		Visitor visitor = new Visitor() ;

		visitor.setId(5);
		visitor.setName("Rani");
		visitor.setEmail("rara@mail.com");
		visitor.setDob(LocalDate.now());
		visitor.setVisitDateTime(LocalDateTime.now());
		visitor.setGender("female");

		entityTransaction.begin();

		entityManager.persist(visitor);

		entityTransaction.commit();

		System.out.println("Bandavle Go see in database");

	}

}
