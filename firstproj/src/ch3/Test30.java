package ch3;

import java.util.Scanner;

public class Test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Which number are you interested in?");
		int i= sc.nextInt(); 

		
		if (i%2==0) {
			System.out.println("2 is the factor of " + i);
			if (i%3==0) {
				System.out.println("3 is the factor of " + i);
			}
		} else {
			System.out.println(i + " is not divided by 2 or 3");
		}
	}

}
