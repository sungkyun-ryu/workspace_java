package assignment;

import java.util.Scanner;

public class PrimeNumber3 {

	public void checkpm() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Give me your number, please: ");
		int n = sc.nextInt();
		int p = (int)Math.pow(10, n-1);
		int q = (int)Math.pow(10, n)-1;
		int a=0; 
		int b=0; 
		if(n==1) {
			System.out.print("2  ");
		}
		
		for(int i=p; i<q; i++) {
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					break;
				} else { /// received only prime numbers;
					for(int k=1; k<n; k++) {
						int l= (int)Math.floor(i * Math.pow(10, -k));
						for(int m=2; m<l; m++) {
							if(l%m==0 || l==1) { ///두자리가 prime이라도 첫자리가 prime이 아니면 그 수를 프린트 하는게 문제
								break;
							} else {
								a= 2; 
							}
										
						}
						
					}
				}
			}
			if(a==2) {
				b=i;			
			}
			System.out.println(b);	
			sc.close(); 
		}
	}
}
		
	
