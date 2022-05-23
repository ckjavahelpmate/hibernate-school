package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetStudentById {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;

		EntityManager entityManager = entityManagerFactory.createEntityManager() ;

		Student student = entityManager.find(Student.class, 8) ;
		
		if( student != null ) {
			
			System.out.println( "Student Id: "+student.getId() ) ; 
			System.out.println( "Student name: "+student.getName() ) ; 
			System.out.println("Student percentage: "+ student.getPercentsge() ) ; 

		}
		else {
			System.out.println("No student exist for given  ID");
		}
		
	
		
	}
	
}
