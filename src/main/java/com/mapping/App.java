package com.mapping;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Student;

public class App 
{
    public static void main( String[] args )
    
    {	
      System.out.println( "Many-To-One Mapping in Hibernate Project2 ");
      
      
            Configuration cfg=new Configuration();
           cfg.configure("config/hibernate.cfg.xml");
           SessionFactory sessionFactory=cfg.buildSessionFactory();
            Session session=sessionFactory.openSession();
      
  Transaction transaction= session.beginTransaction();
   
    
    // create object Student class
      
    
  Student stud=new Student();
   stud.setName("Muzib");
   stud.setEmail("muzib@gmail.com");
   stud.setMobile(123456);
   stud.setAddress("Delhi");
   stud.setCollege("Delhi Uni");
   stud.setCoursename("Java");
   stud.setFee(500);
   
   
   Student stud2=new Student();
   stud2.setName("rahul");
   stud2.setEmail("rahul@gmail.com");
   stud2.setMobile(6578555);
   stud2.setAddress("Noida");
   stud2.setCollege("HBTU Kanpur");
   stud2.setCoursename("Dot Net");
   stud2.setFee(1000);
   
   session.save(stud);
   session.save(stud2);

   
     System.out.println("Insert sucessfully Data Many-To-One");
     
  // String str= session.createQuery();
  // String hib = "FROM Student";
   //List<Student> studentlist = session.createQuery(hib).getResultList();
   

     
     // Update HQL Queary 
   
//   String hib1 = "UPDATE Student set name=:n WHERE rollno=:i";
//   Query q=session.createQuery(hib1);  
//  q.setParameter("n","John");  
//   q.setParameter("i",1);  
//   int status=q.executeUpdate();  
//   System.out.println(status); 

     
//     String hib = "update FROM Student set name='babu' where  id=1";
//   Query query=session.createQuery(hib);  
//   query.executeUpdate();
     
   
   
  // UPDATE Customers
 //  SET ContactName = 'Alfred Schmidt', City= 'Frankfurt'
  // WHERE CustomerID = 1;
    
   // DELETE HQL 
     
//     String hib = "DELETE FROM Student where id=1";
//     Query query=session.createQuery(hib);  
//     query.executeUpdate();
     
   // ------inset HQL------
   String hib = "insert into Student(rollno,name,email,mobile,college,address,coursename,fee)"+
   "select rollno, name,email,mobile,college,address,coursename,fee    from Student";
Query query = session.createQuery(hib);
int result = query.executeUpdate();
   
     
	/*
	 * for (Student stu : studentlist) { System.out.println("ID: " + stu.
	 * getRollno()); System.out.println("Name: " + stu.getName());
	 * System.out.println("email: " + stu.getEmail()); System.out.println("Name: " +
	 * stu.getMobile()); System.out.println("Name: " + stu.getAddress());
	 * System.out.println("Name: " + stu.getCollege()); System.out.println("Name: "
	 * + stu.getCoursename()); System.out.println("Name: " + stu.getFee());
	 * 
	 * 
	 * }
	 */
     
     transaction.commit();
            
      
      session.close();
      sessionFactory.close();
          
            }
				
			}

    
    


