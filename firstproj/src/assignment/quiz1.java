package assignment;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Give me your first chosen number. ");
		int i= sc.nextInt(); 
		System.out.print("And your second chosen one? ");
		int j= sc.nextInt(); 
		
		System.out.println();
		System.out.println("i multiplies j= " + (i*j));
		System.out.println();
		System.out.println("i divided by j= " + (i/j));
		System.out.println();
		System.out.println("The remainder= " + (i%j));
	}

}
