package ch3;

import java.util.Scanner;

public class Apr17_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("What is your upperbound?");
		int a= sc.nextInt(); 
		
		int i=30; 
		
		while(i<=a) {
			System.out.println(i);
			i++; 
		}
		
	}

}
