package com.ruby.java.ch11;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			System.out.println("1");
			
			String s = new String();
			s = null; 
			int a= s.length();
			System.out.println(a);
			
			System.out.println("2");
			System.out.println("3");
		} catch(Exception e) {
			System.out.println("오류발생");
		} finally {
			System.out.println("오케이");
		}
		System.out.println("4");
	}

}
