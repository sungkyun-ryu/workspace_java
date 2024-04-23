package com.ruby.java.test1;

public class Armor {
	String name= "Paul"; 
	int height= 183;
	int weight=78; 
	String color= "red"; 
	boolean isFly= true;
	
	void takeoff() {
		System.out.println("it is taking off" + "\n");
	}
	void land() {
		int a= 10; 
		int b= 100;
		System.out.println(a+b+ "\n");
	}
	void shootLaser() {
		int[][] arr= new int[3][3];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = i+1; 	
				System.out.print(arr[i][j] + "\t");
			} 
			System.out.println();
		}
		System.out.println();
	}
	void launchMissile() {}
	
}

