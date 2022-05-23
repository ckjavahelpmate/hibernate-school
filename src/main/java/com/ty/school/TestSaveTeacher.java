package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveTeacher {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Teacher teacher = new Teacher() ;
		
		teacher.setId(5);
		teacher.setName("Archan");
		teacher.setEmail("archu@mail.com");
		teacher.setPhone("9900789897");
		teacher.setGender("female");
		
		entityTransaction.begin();
		
		entityManager.persist(teacher);
		
		entityTransaction.commit();
		
		System.out.println("Go see in database");
		
		
		
	}

}
