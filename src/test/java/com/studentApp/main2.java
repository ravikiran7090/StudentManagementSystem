package com.studentApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main2 {
	private static List<Student> studentList;

	public static void main(String[] args) {
		System.out.println("******* Student Management System *******");
		System.out.println("******* Welcome *******");
		studentList= new ArrayList<Student>();
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
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		Student result = findStudentById("S-2");
		System.out.println("Result "+ result);
		sortByName();
		
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
