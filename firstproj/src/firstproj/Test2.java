package firstproj;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		int f= 12;
		int g= (~f)+1;
	
		String bi= Integer.toBinaryString(f);
		
		System.out.println(bi);
		
		int h= g<<1;
		int i= g>>1;
		int j= g>>>1; 
		
		String astring_h= Integer.toBinaryString(h);
		String astring_i= Integer.toBinaryString(i);
		String astring_j= Integer.toBinaryString(j);
		
		
		
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(astring_h);
		System.out.println(astring_i);
		System.out.println(astring_j);
		
		System.out.println(i);
		System.out.println(j);
		
		int l= f<<1;
		int m= f>>1;
		int n= f>>>1;
		
		String pos= Integer.toBinaryString(l);
		
		System.out.println(pos);
		
		
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
	}

}
