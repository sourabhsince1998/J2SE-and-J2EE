package com.jsp.First1Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class EMPdao
{
	public static void main(String[] args) {
		
	
		
    
    
    
    Configuration configuration = new Configuration(); 
    configuration.configure("hibernate.cfg.xml");//it is a method it will check whether in our configuration file, there is error?
    SessionFactory buildSessionFactory=configuration.buildSessionFactory();
    
    Session openSession =buildSessionFactory.openSession();
	Emp e1=openSession.get(Emp.class,2);
    System.out.println(e1);
    
    
    //--------connection estd------
   // Session session = buildSessionFactory.openSession();    
   
    
   

    openSession.close();
    buildSessionFactory.close(); //closing costly resources

}
}
