package apr18;

public class Test39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1; 
		int [][]arr= new int[5][5]; 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= num++;
				if(i==j) {
				System.out.println(arr[i][j]);
				}
									
			}
		}
			
	}
		
}

