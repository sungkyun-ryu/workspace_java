package apr18;

public class Test40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1; 
		int sum=0;
		int[][] arr= new int[5][5]; 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num++;
				if(i>=j) {
					 arr[i][j] += arr[i][j];
					 
				} System.out.print(arr[i][j] + "\t");;
			} 
		} System.out.println(sum);  
	}

}
