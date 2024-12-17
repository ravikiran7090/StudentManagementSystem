package com.studentApp;

public class main {

	public static void main(String[] args) {
		System.out.println("******* Student Management System *******");
		System.out.println("******* Welcome *******");
		Student s1;
		s1= new Student("kajal", 22, "S-1");
		s1.enrollCourse("java");
		s1.enrollCourse("dsa");
		s1.enrollCourse("devops");
		s1.enrollCourse("c#");
		s1.printStudentInfo();
		
		Student s2;
		s2= new Student("uday", 25, "S-2");
		s2.enrollCourse("java");
		s2.printStudentInfo();
		
		Student s3;
		s3= new Student("kiran", 27, "S-3");
		s3.enrollCourse("devops");
		s3.printStudentInfo();
	}

}
