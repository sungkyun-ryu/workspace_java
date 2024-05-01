package com.ruby.java.ch09;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("java"); 
		String s2 = new String("java");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();
		
		String s3 = "java"; 
		String s4 = "java";
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println();
		
		if(s1 == s2) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		if(s3 == s4) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		Integer i = 100; 
		System.out.println(i.hashCode());
	}

}
