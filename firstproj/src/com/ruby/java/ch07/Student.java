package com.ruby.java.ch07;

public class Student extends Person{
	

	private String dept;
	private String major; 
	

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + ", " + dept + ", " + major; 
	}
}