package apr18;

public class Work_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= new int[4][5];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= j + 1 + (5*i);
				}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t" );
			} 
			System.out.println("\n");
		}
	} 
}
