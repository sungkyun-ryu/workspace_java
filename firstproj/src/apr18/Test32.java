package apr18;

public class Test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[10];
		a[0]=1; 
		System.out.println(a[0]);
		for(int i=1; i<10; i++) {
			a[i]= a[i-1]+5;
			System.out.println(a[i]);
		}
		
		int[]b= {1,2,3,4,5};
		System.out.println(b[3]);
		
		int[]c= new int[8];
		System.out.println(c[0]);
					
		String[] name= new String[10];
		System.out.println(name[5]);
	}

}
