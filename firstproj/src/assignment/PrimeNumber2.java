package assignment;

import java.util.Scanner;

public class PrimeNumber2 { 

	public void checkpm() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Give me your number, please: ");
		int n = sc.nextInt();
		int p = (int)Math.pow(10, n-1);
		int q = (int)Math.pow(10, n)-1;
		int a = 0; 
		if(n==1) {
			System.out.print("2  ");
		}
		for(int i=p; i<q; i++) {
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					a=1; break;
				} else {
				a=2; 
				}
			}
			if(a==2) {
				System.out.print(i+ "  ");
			}
				
		}
		sc.close(); 
		
	} 
}
