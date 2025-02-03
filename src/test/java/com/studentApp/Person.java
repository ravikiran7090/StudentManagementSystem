package com.studentApp;

public class Person {
	private String name;
	private int age;
	//default constructor
	public Person(){
		this.name="ravikiran";
		this.age=28;
	}
	
	//parametrized constructor
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	//constructor chainning
	public Person(String name){
		this(name, 0);
		System.out.println("constuctor chainning called..");
	}
	
	
	
	
	
	
	public void displayInfo() {
		System.out.println("person name: "+name+" age : "+ age);
	}
}
