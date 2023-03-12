package com.jsp.First1Project;
 

//import org.hibernate.Service.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;

import antlr.collections.List;
//DAO CLASS
public class App 
{
    public static void main( String[] args )
    {
    	/*Emp e=new Emp();
    	e.seteName("sourabh3");
    	e.seteSal(670000);
        e.setX(20);*/
    	
    	
    	Student st=new Student();
    	st.setUsn(1);
    	st.setName("Sandesh");
    	st.setMarks(58);
    
    	
    	Configuration configuration = new Configuration(); 
      configuration.configure("hibernate.cfg.xml");//it is a method it will check whether in our configuration file, there is error?
      
     // ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
      SessionFactory buildSessionFactory = configuration.buildSessionFactory(); //jdbc connection
   
      
      //--------connection estd------
    
      
      Session session = buildSessionFactory.openSession();    
     
       // Emp e1=openSession.get(Emp.class,2);
        
       // System.out.println(e1);
      
     Transaction tx = session.beginTransaction(); //to delete and insert we need transaction if we want fetch we dont want
     session.save(st);
      tx.commit(); // data saving permanently in db 
      //Session.close();
      buildSessionFactory.close(); //closing costly resources
     
    }
}


