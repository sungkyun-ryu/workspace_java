package apr18;

public class Work5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1= {{1,2,3,4},{1,1,1,1},{0,0,0,0}};
		int[][] arr2= {{1,2,3,4},{1,1,1,1},{1,1,1,1}};
		int sum=0;
		int[][] arr3= new int[4][4];
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				sum= arr1[i][j] + arr2[i][j];
				sum= arr3[i][j]; 
			} 
			
		}
		
	}

}
