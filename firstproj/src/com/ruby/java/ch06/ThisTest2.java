package com.ruby.java.ch06;

class Student3 { 
	String name; 
	int age; 
	private String getName() {
		return name;
	}
	
	public Student3() {} ; 
	public Student3(String name) {
			this.name = name;
	}
}

public class ThisTest2 {

	private String name;
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String getName() {
		return this.name ; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s= new Student3(); 
		s.age = 11; 
	}

}
