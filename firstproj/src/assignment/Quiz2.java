package assignment;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Give me your favourite number. ");
		int n= sc.nextInt(); 
		int a= 1; 
		System.out.println();
		
		for(int i=2; i<= n; i++) {
			a= a+i;
		} System.out.println("The summation is whole numbers are " + a);
		
		int b=1;
		for(int i=2; i<=n; i++) {
			if(i%2==1) {
				b= b+i;
			} 
		} System.out.println("The summation of odd numbers are " + b);
		
		int c=2; 
		for(int i=3; i<=n; i++) {
			if(i%2==0) {
				c= c+i;
			}
		} System.out.println("The summation of even numbers are " + c);
	}
}
