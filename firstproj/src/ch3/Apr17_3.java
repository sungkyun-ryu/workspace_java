package ch3;

import java.util.Scanner;

public class Apr17_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner 
		Scanner sc= new Scanner(System.in);
		
		//
		System.out.print("Insert your score");
		
		// Insert my grade
		int score= sc.nextInt();
		
		// Set a blank string as "grade" 
		String grade= "";
		
		// Produce the grade 
		if (score >=85) {
			grade= "Distinction";
		} else if(score >=70) {
			grade= "Merit";
		} else if(score >=50) {
			grade= "Pass";
		} else {
			grade= "Fail";
		}
		
		// Print out the grade
		System.out.println(grade);
		
		
		
	}

}
