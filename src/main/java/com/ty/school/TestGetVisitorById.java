package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVisitorById {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;

		EntityManager entityManager = entityManagerFactory.createEntityManager() ;

		Visitor visitor = entityManager.find(Visitor.class, 0) ;
		
		if( visitor != null ) {
			
			System.out.println( "Visitor Id: "+visitor.getId() ) ; 
			System.out.println( "Visitor name: "+visitor.getName() ) ; 
			System.out.println("Visitor dob: "+ visitor.getDob() ) ; 
			System.out.println("Visitor gender: "+ visitor.getGender() ) ; 
			System.out.println("Visitor email: "+ visitor.getEmail() ) ; 
			System.out.println("Visitor visit date: "+ visitor.getVisitDateTime() ) ; 
			
		}
		else {
			
			System.out.println("No visitor exist for given ID");
		}
		
	

		
	}
	
}
