package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMergeStudent {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas" ) ;
		EntityManager  entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Student student = new Student() ;
		student.setId(5);
		student.setName("Ranga Raj");
		student.setPercentsge(55.4);
		
		entityTransaction.begin();
		entityManager.merge(student) ;
		entityTransaction.commit();

	}

}
