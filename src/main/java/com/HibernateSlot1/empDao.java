
/*creation of dao to implement methods and establish
 * connection 
 */
package com.HibernateSlot1;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class empDao {

	Configuration conf;
	SessionFactory sesf;
	Session ses;
	Transaction tr;
	
	//connection method to establish connection and add employee ,fresherEmp and experienceEmp  class
	public void Connect() {
		
		conf = new Configuration().configure().addAnnotatedClass(employee.class).addAnnotatedClass(fresherEmp.class).addAnnotatedClass(experienceEmp.class);
	
		sesf = conf.buildSessionFactory();
		
		ses = sesf.openSession();
		
		tr = ses.beginTransaction();
	}
	//method to add & save details of fresher employee & commit transaction
	public void addEmployee(fresherEmp ef) {
		
		ses.save(ef);
		
		tr.commit();
		
	}
	//method to add employee based on experience & commit transaction
     public void addEmployee(experienceEmp exp) {
		
		ses.save(exp);
		
		tr.commit();
	
     }
   //method to get details of employee
     public employee getEmployee(int empId) {
 		
		employee e =(employee)ses.load(employee.class, empId);
		
		tr.commit();
		return e;
	
     }
   //method to remove employee from table
     public int removeEmployee(int empId) {
    	 
    	 Query Q = ses.createQuery("delete from employee e where e.empId=: empId").setParameter("empId", empId);
 		int q = Q.executeUpdate();
 		return q;
 	
     }
	
	
}

     
     
     
     
     