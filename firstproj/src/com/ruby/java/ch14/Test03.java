package com.ruby.java.ch14;

interface Verify {
	void check(int n);
}

public class Test03 {
	public static void main(String[] args) {
		Verify isEven = (n) -> System.out.println((n % 2) == 0);
		isEven.check(11); 
		isEven.check(10);
		
//		Verify isPositive = (n) -> n >= 0;
//		System.out.println(isPositive.check(-5));
	}
}