package com.ruby.java.ch11;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {		
			int zero = 32/0; 
			String s = new String("java"); 
			int len= s.length();
			System.out.println(len); // 결과값 4
			
			s=null; /// NullPointer
			s.length(); 
			System.out.println("null length");
			
			int arr[] = new int[3]; 
			arr[3] = 39; /// OutofBounds
			System.out.println("Okay");		
		}
		catch(Exception e) {
			System.out.println("오류    " + e);
		}
//		catch(ArrayIndexOutOfBoundsException e1) {
//			System.out.println(e1.getMessage());
//		}
//		catch(NullPointerException e2) {
//			System.out.println("Wrong reference");
//			e2.printStackTrace();
//		}
		
		System.out.println("Good");
	}
}
