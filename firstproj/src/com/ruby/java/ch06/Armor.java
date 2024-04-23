package com.ruby.java.ch06;

class Student{
	private String sname;
	private int age;
	
}

public class Armor {
	private String name;
	private int height;
	
	public String getName() {
		return name;
	}
	
	public void setName(String value) {
		name= value;
	}
	
	public static void main(String[] args) {
		Armor a[] = new Armor[10]; //배열생성자
		for(int i=0; i<a.length; i++) {
			a[i]= new Armor();
		}
		Armor b= new Armor(); //생성자
		Armor suit1= new Armor();
		suit1.setName("Mark");
		System.out.println(suit1.getName());
		System.out.println(b.getName());
		System.out.println(a[0]);
		System.out.println(suit1.height);
		
		
		
		
		
			
		
	}
}
