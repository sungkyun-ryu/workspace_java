package ch3;

import java.util.Scanner;

public class Test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Give me your first choice number.");
		int i= sc.nextInt(); 
		System.out.println("The second choice?");
		int j= sc.nextInt(); 
		
		for(; i<10; i++) {
			for(; j<10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}

}
