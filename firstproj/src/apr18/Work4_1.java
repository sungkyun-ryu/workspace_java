package apr18;

public class Work4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1; 
		int [][]arr= new int[5][5]; 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= num++; 
				System.out.print(arr[i][j] + "\t");
			} System.out.println("\n");
		}
	}

}
