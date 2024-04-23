package assignment;

import java.util.Scanner;

public class MatrixCalc {
	
	private int[][] matrix;
	int n;
	int m; 
	
	public void getMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of rows? ");
		n= sc.nextInt();
		System.out.print("Number of columns? ");
		m= sc.nextInt();
		System.out.println();
		matrix= new int[n][m]; 
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
//				System.out.print("Give me your numbers ");
				matrix[i][j]= (int)(Math.random()*10);
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		sc.close();
		
	} 
	
	public void work_row() {
		for(int i=0; i<n; i++) {
			int sum=0;
			for(int j=0; j<m; j++) {
				sum += matrix[i][j];
			}
			System.out.println("The sum of the row " + (i+1) + " is " + sum + "\n");
		}
	}
	
	public void work_column() {
		for(int j=0; j<m; j++) { 
			int sum=0;
			for(int i=0; i<n; i++) {
				sum += matrix[i][j];
			}
			System.out.println("The sum of the column " + (j+1) + " is " + sum + "\n");
		}
	}
	
}

