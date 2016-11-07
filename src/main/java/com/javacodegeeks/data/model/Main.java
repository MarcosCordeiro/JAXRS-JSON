package com.javacodegeeks.data.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Main {
	 private static final String PERSISTENCE_UNIT_NAME = "JPADerby";
     private static EntityManagerFactory factory;

     public static void main(String[] args) {
    	 factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
         EntityManager em = factory.createEntityManager();
         Query q = em.createQuery("select t from Student t");
		List<Student> studentList = q.getResultList();
         
         for(Student s : studentList){
        	 System.out.println(s);
         }
         
         em.close();
	}
}
