package ch3;

import java.util.Scanner;

public class Apr17_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("what is your upperbound?");
		int k= sc.nextInt(); 
		
		do {
			System.out.println(k);
			k++;
		} while(k<= 100);
	
	}

}
