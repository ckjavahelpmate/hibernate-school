package com.ty.school;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetMultipleStudent {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		
		String sql = "Select s From Student s" ;
		
		Query query = entityManager.createQuery(sql) ;
		
		List<Student> students = query.getResultList() ;
		
		for( Student student : students ) {
			System.out.println("Student ID: "+student.getId());
			System.out.println("Student name: "+student.getName());
			System.out.println("Student percentage: "+student.getPercentsge());
			System.out.println("*********************************");
		}
		
	}

}
