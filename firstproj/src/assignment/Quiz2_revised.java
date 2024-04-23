package assignment;

import java.util.Scanner;

public class Quiz2_revised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
	 
		
		while(true) {
			System.out.print("What is your number?");
			int n= sc.nextInt();
			if (n==0)
				break; 
			int sum1=0;
			int sum2=0;
			for(int i=1; i<=n; i++) {
				if(i%2 != 0) {
					sum1 += i;
				} else {
					sum2 += i; 
				}
				
			} System.out.println("Odd sum is " + sum1);
			  System.out.println("Even sum is " + sum2);
			  System.out.println("The sum is " + (sum1 + sum2));
		} System.out.println("The END");
	}

}
