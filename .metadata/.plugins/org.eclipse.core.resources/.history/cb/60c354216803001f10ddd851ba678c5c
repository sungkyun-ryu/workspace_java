package com.ruby.java.ch07;

public class Employee extends Person{

	private String dept;
	
	public Employee() {
		System.out.println("Employee 생성자 호출");
	} ; 
	
	public Employee(String name, int age, String dept) {
		super(name, age) ; // Constructor of parent class
		this.dept = dept; 
	 
	}
		
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return getName() + ", " + getAge() + ", " + dept; //Is not getName() contained in Person, not Employee? A. in heap, data from parent and child is stored together. If there is getName() in Employee class, then overriding happens, but in this case it doesn't. 
	}
}