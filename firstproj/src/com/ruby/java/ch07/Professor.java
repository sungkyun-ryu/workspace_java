package com.ruby.java.ch07;

public class Professor extends Person {


	private String subject;
	private String dept;
	

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return  super.toString() + ", " + dept + ", " + subject;
	}
}