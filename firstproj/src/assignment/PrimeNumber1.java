package assignment;

import java.util.Scanner;

public class PrimeNumber1 {
	
	public void checkpm() {
		Scanner sc= new Scanner(System.in);
		System.out.print("What is your number: ");
		int n = sc.nextInt(); 
		int a=0;
		for(int i=2; i<n; i++) { 
			if(n%i==0) {
				a = 1; 
				break;
			} else { 
				a = 2;
			}
		}
		if(a==1) {
			System.out.println(n + " is not a prime number.");
		} else {
			System.out.println(n + " is a prime number.");
		}
		sc.close();
	}
}

			
			
		 
		
		
		
		
		
		
		
		
