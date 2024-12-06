package com.jdbc.ajp.project.student_mgmt;

import java.util.Scanner;

import com.jdbc.ajp.project.student_mgmt.daoimpl.StudentDAOImpl;
import com.jdbc.ajp.project.student_mgmt.entity.Student;

/**
 * Class containing the "main" method
 * prints Hello world! by default - replace with your code
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        //remove the line below and replace with your code.
        System.out.println( "Hello World!" );
        System.out.println("\n-------------Student Management System--------------");
		System.out.println("1. create student");
		System.out.println("2. view student");
		System.out.println("3. view  all student");
		System.out.println("4. Update student");
		System.out.println("5. Delete student");
		System.out.println("6. Exit");
		
		int ch;
		StudentDAOImpl sd=new StudentDAOImpl();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your choice");
		ch=scan.nextInt();
		switch(ch) {
		case 1 : System.out.println("Enter id :");
			int id=scan.nextInt();
			System.out.println("Enter Name :");
			scan=new Scanner(System.in);
			String name=scan.nextLine();
			
			System.out.println("Enter Age :");
			
			int age=scan.nextInt();
			System.out.println("Enter Contact :");
			scan=new Scanner(System.in);
			String contact=scan.nextLine();
			System.out.println("Enter Course :");
			scan=new Scanner(System.in);
			String course=scan.nextLine();
			System.out.println("Enter Email :");
			scan=new Scanner(System.in);
			String email=scan.nextLine();
			Student s=new Student(id,name,age,contact,course,email);
			sd.createStudent(s);
			System.out.println("enter student sucessfully");
			break;
		
		case 2 :	System.out.println("Enter id :");
					int id1=scan.nextInt();	
					Student s1=sd.displayStudent(id1);
					System.out.println(s1);
					break;
		
		case 3 : break;
		
		case 4 : 	 System.out.println("Enter id :");
					int id3=scan.nextInt();
					System.out.println("Enter Name :");
					String name3=scan.nextLine();
					System.out.println("Enter Age :");
					int age3=scan.nextInt();
					System.out.println("Enter Contact :");
					String contact3=scan.nextLine();
					System.out.println("Enter Course :");
					String course3=scan.nextLine();
					System.out.println("Enter Email :");
					String email3=scan.nextLine();
					Student s3=new Student(id3,name3,age3,contact3,course3,email3);
					sd.updateStudent(s3);
					break;
			
		case 5 : 	System.out.println("Enter id :");
					int id4=scan.nextInt();
					sd.deleteStudent(id4);
					break;
		case 6 : System.exit(0);
					break;
			default: System.out.println("enter valid input");
		}

    }
}
