package apr18;

public class Test35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		int[] a= new int[10];
		System.out.println(a.length);
		System.out.println(arr.length + "\n");
		for(int num : arr) {
			a[num]= num*140; 
			System.out.println(a[num]);	
		}
		
	}

}
