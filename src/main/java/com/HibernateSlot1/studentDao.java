package com.HibernateSlot1;

import org.hibernate.cfg.Configuration;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class studentDao {
	
	Configuration conf; 
	SessionFactory ses;
	Session ps;
	Transaction ts;
	
	//connection method to establish connection and add student and laptop class
	public void connect() {
		
		conf =new Configuration().configure().addAnnotatedClass(student.class).addAnnotatedClass(laptop.class);
		
		ses =conf.buildSessionFactory();
		
		ps=ses.openSession();
		
		ts =ps.beginTransaction();
		
	}
	
	//method to save details of student & commit transaction
	public void addStudent(student s) {
		
		ps.save(s);
		
		ts.commit();
		
	}
	
   //method to save details of laptop & commit transaction
	public void addLaptop(laptop lp) {
		ps.save(lp);
		
		ts.commit();

		
	}
	//method to get details of student
	public student getStudent(int sId) {
		
		student s1=(student)ps.load(student.class ,sId);
		return s1;
		
		
	}
	//method to get details of laptop
	public laptop getlaptop(int laptopId) {
		
		laptop lp1=(laptop)ps.load(laptop.class, laptopId);
		return lp1;
	}
	//method to remove student from table
	public int removeStudent(int sId) {
		
		Query sq=ps.createQuery("delete from student s where sId =:sId").setParameter("sId", sId);
	
		int rs =sq.executeUpdate();
 		return rs;
	}

}
