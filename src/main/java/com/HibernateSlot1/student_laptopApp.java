/*java program to implement one to many relationship 
   with student and laptops
   (one student with many laptops)
 */

package com.HibernateSlot1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//main class to implement relation
public class student_laptopApp {
	
	public static void main(String []args) {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  //declaration of instance variables of laptop & student class
	  int sId;
	  String sName;
	  String sDomain;
	  int sMarks;
	  int laptop;
	  int laptopId;
	  String laptopModel;
      String laptopCompany;
	  int laptopGen;
	  
	  //creation of a list to store laptop in it
	  List<laptop> al=new ArrayList<laptop>();
	 
	  //object of studentDao class 
	  studentDao dao= new studentDao();
	  student s1 = new student();                                     //object for student class
	  laptop lp = new laptop();                                       //object of laptop class
	  
	  int op =0;
	  //loop to implement operations one by one 
	  while(op<5) {
		  
		  System.out.println("Press 1 :To add student \nPress 2 :To retrieve details of a student \nPress 3:To retrive laptop detail\nPress 4: To remove student");
		  op = sc.nextInt();
		  
		  switch(op) {
		  
		  //This case is used to add student with laptop
		  case 1 ->{
			  
			  System.out.println("-------Enter student details-----");
			  
			  System.out.println("Enter student Id :");
			  sId =sc.nextInt();
			  s1.setsId(sId);
			  
			  System.out.println("Enter student Name :");
			  sName =sc.next();
			  s1.setsName(sName);
			  
			  System.out.println("Enter student Domain :");
			  sDomain =sc.next();
			  s1.setsDomain(sDomain);
 	          
			  System.out.println("Enter student Marks:");
			  sMarks =sc.nextInt();
			  s1.setsMarks(sMarks);
			  System.out.println("Enter no of laptop");
			  laptop =sc.nextInt();
			  
			  //loop to store laptop in list
			  for(int i=1 ; i<=laptop ; i++) {
				  
				  laptop l =new laptop();
				  System.out.println("Enter laptop id :");
				  laptopId =sc.nextInt();
				  l.setLaptopId(laptopId);
				  System.out.println("Enter laptop Model :");
	
				  laptopModel =sc.next();
				  l.setLaptopModel(laptopModel);
				  System.out.println("Enter laptop company :");
				  laptopCompany =sc.next();
				  l.setLaptopCompany(laptopCompany);
				  System.out.println("Enter laptop generation :");
				  laptopGen =sc.nextInt();
				  l.setLaptopGen(laptopGen);
				  dao.connect();                                                   //calling of connect method to establish connection
				  dao.addLaptop(l);                                                //calling addLaptop method
				  al.add(l);
			  }
			  
			  s1.setLp(al);
			  dao.connect();                                                      //method to invoke database
			  dao.addStudent(s1);
			  System.out.println("Student & their Laptop Added Successfull !");
			  
		  }
		  
		  //case to retrieve data of student with laptop
		  case 2 ->{
			  
			  System.out.println("----Enter id to get details of student---");
			  sId=sc.nextInt();
			  dao.connect();
			  s1 = dao.getStudent(sId);
			  System.out.println(s1);
		  }
		  
		  //case 3 is used to get details of laptops
          case 3 ->{
			  
			  System.out.println("----Enter id to get details of laptop---");
			  laptopId=sc.nextInt();
			  dao.connect();
		      lp = dao.getlaptop(laptopId);
			  System.out.println(lp);
		  }
		  
          //to delete any specific student 
		  case 4 ->{
			  
			  System.out.println("---Enter id to remove student---");
			  sId = sc.nextInt();
			  dao.connect();
			  int rs=dao.removeStudent(sId);
			  if (rs==1)
			  System.out.println("---delete student successfully---");
			  else 
		      System.out.println("Enter valid id! ");
		  }
		  
		  }
		  
	  }
	  
     sc.close();
  }
}