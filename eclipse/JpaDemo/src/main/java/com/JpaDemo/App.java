package com.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien a=new Alien();
    	a.setAid(7);
    	a.setAname("prawin&");
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaDemo");
        EntityManager em=emf.createEntityManager();
    	
    	//Alien a=em.find(Alien.class,1);
    	 em.getTransaction().begin();
    	 em.persist(a);
    	 em.getTransaction().commit();
    	 
    	System.out.println(a);
    	
    	
    }
}
