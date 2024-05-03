package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MatrixMultiplication_class {

	private static int [][] LoadMatrix(String fname) {
		int[][] ret = null;  
		List<String> list = new ArrayList<>(); 
		String str; 
		try(BufferedReader br = new BufferedReader(
				new FileReader(fname))) {
			while((str=br.readLine()) != null) {
				list.add(str); 
			} 
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		for(int i=0; i < list.size(); i++) {
			String[] arr = list.get(i).split(" ");
			if(ret == null) {
				ret= new int[list.size()][arr.length];
			}
			for(int j=0; j < arr.length; j++) {
				ret[i][j] = Integer.parseInt(arr[j]);
			}
		}
		return ret; 
	}

	private static void printMatrix(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-".repeat(30));
	}

	//구현하기
	private static int[][] calcMatrix(int[][] a, int[][] b) {  
		int [][] c = null;
		int sum=0;
		for(int i=0; i<a.length; i++) {
			if(c == null) {
				c= new int[a.length][b[0].length];
			} 		
			for(int k=0; k<a.length; k++) {
				for(int j=0; j<b.length; j++) {
					sum += a[i][j] * b[j][k];
				}
				c[i][k] = sum; 
				sum= 0;
			}		
		} return c;
	}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int[][] a = LoadMatrix("m3x4"); 
				if (a == null) return; 
				printMatrix(a); 

				int[][] b = LoadMatrix("m4x3"); 
				if (b ==null) return; 
				printMatrix(b); 

				int[][] c = calcMatrix(a, b); 
				printMatrix(c); 
			}

		}
