package com.ruby.java.ch10;

import java.util.ArrayList;

public class MyTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>() ;
		arr.add(3); 
		arr.add(4); 
		
		int b= arr.get(0) + arr.get(1);
		System.out.println(arr.get(1));
		System.out.println(arr.toString());
		System.out.println(b);
	}

}


