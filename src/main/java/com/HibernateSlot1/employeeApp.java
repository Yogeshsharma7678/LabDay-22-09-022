/*
 hibernate program to implement inheritance between
 classes
 *Yogesh Sharma
 */
package com.HibernateSlot1;

import java.util.Scanner;

//main class to implement relation
public class employeeApp 
{   
	
    public static void main( String[] args )
    {
       
    	Scanner sc = new Scanner(System.in);
    	
    	//declaration of instance variables of employee , fresherEmp & experienceEmp class
    	int empId;
    	String empName;
    	String contractPeriod;
    	int increment;
    	String experience;
    	int Hike;
    	
    	//object of empDao class 
    	empDao dao = new empDao();
    	employee e = new employee();
    	fresherEmp ef = new fresherEmp();
    	experienceEmp exp = new experienceEmp();
    	
    	int op=0;
    	
    	 //loop to implement operations one by one 
    	while(op<5) {
    		
    		System.out.println("Press 1: To add  fresh employee \nPress 2: To add experienced employee\nPress 3: To get deatils of an Employee\nPress 4: To remove employee");
    	    
    		op=sc.nextInt();
    		
    		switch(op) {
    		
    		//This case is used to add  fresher employee 
    		case 1 ->{
    			
    			System.out.println("Enter employee deatails:");
    			
    			System.out.println("Employee Id:");
    			empId = sc.nextInt();
    			ef.setEmpId(empId);
    			
    			System.out.println("Employee Name:");
    			
    			empName = sc.next();
    			ef.setEmpName(empName);
    			
    			System.out.println("Employee Contract Period ");
    			
    			contractPeriod = sc.next();
    			ef.setContractPeriod(contractPeriod);
    			
    			System.out.println("Employee increament Per Year:");
    			
    			increment =sc.nextInt();
    			ef.setIncrement(increment);
    			
    			dao.Connect();
    			dao.addEmployee(ef);
    			
    			System.out.println("Employee Added Successfully");
    			
    		}
    		//This case is used to add  experience employee 
    		case 2->{
    			
    			
    			System.out.println("Enter employee deatails:");
    			
    			System.out.println("Employee Id:");
    			empId = sc.nextInt();
    			exp.setEmpId(empId);
    			
    			System.out.println("Employee Name:");
    			
    			empName = sc.next();
    			exp.setEmpName(empName);
    			
    			System.out.println("Employee Experience: ");
    			
    			experience = sc.next();
    			exp.setExperience(experience);;
    			
    			System.out.println("Employee hike in salary:");
    			
    			Hike =sc.nextInt();
    			exp.setHike(Hike);
    			
    			dao.Connect();
    			dao.addEmployee(exp);
    			
    			System.out.println("Employee Added Successfully");
    		}
  		  //case 3 is used to get details of employee
    		case 3 ->{
    			
                 System.out.println("Enter employee id ");
                 
                 empId=sc.nextInt();
                 
                 dao.Connect();
                 e = dao.getEmployee(empId);
                 
                 System.out.println(e);
    		}
            //to delete any specific employee
    		case 4 ->{
    			
    			System.out.println("Enter id of employee which you want to remove:");
    			empId = sc.nextInt();
    			dao.Connect();
    			int es =dao.removeEmployee(empId);
    			if(es==1) {
   				 System.out.println("Removed Successfull");
    			}   			 
   				 else
   				 System.out.println("Employee does'nt Exist:");

    		}
    		
    		
    		}
    	}
    sc.close();	
    }
}
