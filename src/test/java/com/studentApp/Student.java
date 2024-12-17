package com.studentApp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
// instance variable
  private	String name;
  private	int age;
  private	String studentId;
  private	List<String> courses;

  public Student(String name, int age, String studentId) {
	super();
	if(validateAge(age) && validateName(name) && validateStudentId(studentId)) {
	this.name = name;
	this.age = age;
	this.studentId = studentId;
	courses = new ArrayList<String>();//initialize of courses
}}
  public boolean validateStudentId(String studentId) {
	String studentIdRegex="S-\\d+$";
	Pattern studentIdPattern = Pattern.compile(studentIdRegex);
	Matcher studentIdMatcher = studentIdPattern.matcher(studentId);
	if(studentIdMatcher.matches()) {
		return true;
	}
	else {
		System.err.println("Invalid student Id ... Use the format S-digits");
	return false;
}}
public void enrollCourse(String course) {
	if(validateCourse(course)) {
	if(!courses.contains(course)) { 
	courses.add(course);
	  System.out.println("Student is enrolled to "+course+" successfully");
  }else {
	  System.err.println("Student is already enrolled to the course "+ course);
  }}
	
}
  public void printStudentInfo() {
	System.out.println("*****  Student details *****");
	  
	  System.out.println("Student Name " +name);
	  System.out.println("Student age "+ age);
	  System.out.println("Student Id "+studentId);
	  System.out.println("Enrolled for "+courses);
	  
  }
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public String getStudentId() {
	return studentId;
}
public List<String> getCourses() {
	return courses;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + ", courses=" + courses + "]";
}
public boolean validateAge(int age) {
	if(age>=19 && age<=35) {
		return true;
	}
	else {
		System.err.println("Invalid age !!! student Age needs to be between 19 and 35");
		return false;
	}

}

public boolean validateName(String name) {
	// the name can be start from
	String nameRegex = "^[a-zA-Z\\s]+$";
	Pattern namePattern = Pattern.compile(nameRegex);
	Matcher nameMatcher = namePattern.matcher(name);
	if(nameMatcher.matches()) {
		return true;
	}
	else {
		System.err.println("Invalide Name !!! Please enter alphabets only");
		return false;
	}
}
 public boolean validateCourse(String course) {
	 if(course.equalsIgnoreCase("java")||course.equalsIgnoreCase("DSA")||course.equalsIgnoreCase("devops")) {
		 return true;
	 }
	 else {
		System.err.println("Invalide Course name !!! Please select the courses from the list [java, dsa,devops] ");
		return false;
	 }
 }
  	

}
