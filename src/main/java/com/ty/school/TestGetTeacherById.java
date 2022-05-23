package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetTeacherById {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;

		EntityManager entityManager = entityManagerFactory.createEntityManager() ;

		Teacher teacher = entityManager.find(Teacher.class, 1) ;
		
		if( teacher != null ) {
			
			System.out.println( "Teacher Id: "+teacher.getId() ) ; 
			System.out.println( "Teacher name: "+teacher.getName() ) ; 
			System.out.println("Teacher email: "+ teacher.getEmail() ) ; 
			System.out.println("Teacher phone: "+ teacher.getPhone() ) ; 
			System.out.println("Teacher gender: "+ teacher.getGender() ) ; 

		}
		else {
			System.out.println("No Teacher exist for given  ID");
		}
		
	
		
	}
	
}
