package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {

	public static void main(String[] args) {

		// step-01 :: create EntityManagerFactory Object.
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		
		// step-02 :: create EntityManager Object.
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		
		// step-03 :: create EntityTransaction Object.
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		
		// step-04 :: create Student Object.
		Student student = new Student() ;
		student.setId(6);
		student.setName("Japan");
		student.setPercentsge(36);
		
		
		// step-05 :: Begin the Transaction
		entityTransaction.begin(); 
		
		// Step-06 :: Supply the Object to hibernate
		entityManager.persist(student);
		
		// step-07 :: Save the transaction 
		entityTransaction.commit();
		
		System.out.println("Kelsa Aythu maga");

	}

}
