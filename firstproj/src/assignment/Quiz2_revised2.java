package assignment;

import java.util.Scanner;

public class Quiz2_revised2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("What is your number? ");
		int n= sc.nextInt();
		int sum1= 0;
		int sum2= 0;
		for(int i=1; i<=n; i++) {
			if(i%2 != 0) {
				sum2 += i;
			} else {
				sum1 += i; 
			} 
		} System.out.println("The odd sum is " + sum1);
		System.out.println("The even sum is " + sum2);
		System.out.println("The whole sum is " + (sum1 + sum2));
	}

}
