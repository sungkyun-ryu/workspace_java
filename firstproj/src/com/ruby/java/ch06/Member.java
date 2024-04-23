package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;
	public Member() {
	}
	public Member(String name, int a) {
		this.name= name; 
		age = a;
	}
	public void setName(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
		
		Member m = new Member("jason", 18); 
	}

}
