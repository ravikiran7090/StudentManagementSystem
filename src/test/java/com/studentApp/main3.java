package com.studentApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main3 {

	
		private static List<Student> studentList;
		private  static Scanner scanner;

		public static void main(String[] args) {
			System.out.println("******* Student Management System *******");
			
			studentList= new ArrayList<Student>();
			while(true) {
			scanner=new Scanner(System.in);
	    System.out.println("******* Welcome *******");
		System.out.println(" Select an option...");
				
		
		System.out.println("1. Register a student ");
		System.out.println("2. Find Student with studentId");
		System.out.println("3. List All Student Information");
		System.out.println("4. List All Student Information in sorted order");
		System.out.println("5. Exit");
		int option=scanner.nextInt();
		switch(option) {
		case 1:
			enrollStudent(scanner);
		    break;
		       
		case 2:
			findStudentById(scanner);
		    break;
		
		case 3:
			printAllStudentData();
		    break;
		       
		case 4:
			sortByName();
		    break;
		case 5:
			exit();
		    break;
		       
		 default: System.out.println("Invalid option selected.. Enter between 1 to 5");     
		       
		}
			}
		}
		private static void exit() {
			// TODO Auto-generated method stub
			
		}
		private static void printAllStudentData() {
			if(studentList.size()>0) {
			System.out.println("**** List of All Students ****");
            for (Student student : studentList) {
                student.printStudentInfo();
            }
            System.out.println("**** Printed all student Data ****");
			}
			else {
				System.out.println("Student list is empty .. No Student registered");
			}
		}
		private static void findStudentById(Scanner scanner2) {
			// TODO Auto-generated method stub
			
		}
		private static void enrollStudent(Scanner scanner2) {
		System.out.println("Enter the Student Name");
		String studentName=scanner2.next();
		
		System.out.println("Enter the Student Age");
		int studentAge=scanner2.nextInt();
		
		System.out.println("Enter the Student Id");
		String studentId=scanner2.next();
		
		Student newStudent=new Student(studentName, studentAge, studentId);
		studentList.add(newStudent);
		while(true) {
		System.out.println(" Enter the course to be enrolled.. enter done to exit");
		String courseName=scanner2.next();
		if(courseName.equalsIgnoreCase("done")) {
			break;
		}
		newStudent.enrollCourse(courseName);
		}
		System.out.println("Student registration Complete");
		newStudent.printStudentInfo();
		}
		private static void sortByName() {
			Comparator<Student> studengtComparator =(o1,o2) -> o1.getName().compareTo(o2.getName()); 
			/*
			 * new Comparator<Student>(){
			 * @Overrride
			 * public int compare(Student o1, student o2){
			 * return o1.getName().compareTo(o2.getName());
			 * }
			 * };
			 * 
			 */
			Collections.sort(studentList, studengtComparator);
			System.out.println(studentList);
		}
		
		public static Student findStudentById(String studentId ) {
			Student result= null;
			try {
			
		 result = studentList.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId)).findFirst()
			.orElseThrow(()-> new RuntimeException("no Data found !!!"));
			}
			catch(RuntimeException e){
				System.err.println("Student with ID "+studentId+" not found!!");
			}
		  return result;
		}
		



	}


