package ch3;

import java.util.Scanner;

public class Apr17_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Switch~Case
//		int a= 3847;
//		int b= 207;
//		char op= '*';
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("first score");
		int a = sc.nextInt(); 
		System.out.println("Second score");
		int b = sc.nextInt();
		System.out.println("Operation");
		String ops= sc.next(); 
		char op= ops.charAt(0); 
		
		
		
		switch(op) {
		case '+':
			System.out.println(a+b); break;
		case '-':
			System.out.println(a-b); break;
		case '%':
			System.out.println(a%b); 
		case '*':
			System.out.println(a*b); 
		case '/':
			System.out.println(a/b); 
		default: 
			System.out.println(Math.pow(a, b));
		}
	}

}
