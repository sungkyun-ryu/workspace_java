package assignment;
/*
 * 정수 배열을 정렬후 출력
 * 실수 배열을 정렬후 출력
 * 스트링 배열을 정렬후 출력하는 코드 완성 
 */
import java.util.Arrays;
import java.util.Random; 

public class test_정수배열정렬{
	static void showData(Object[] data) {
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i] + "  ");
		}
	}
//class Mylist<T> {
//	public Mylist(T[] arr) {
//		Object[] mylist = (Object[]) arr; 
//	}
//}
			
public static void main(String[] args) {
	
	int [] data = new int[20];
	double []doubleData = new double[20];
	String [] stringData = {"apple","grape","blueberry","banana"};
	
	Random rnd= new Random(); 
	
	for (int i = 0; i < data.length; i++) {
		data[i] = rnd.nextInt(1, 46); 
		doubleData[i]= rnd.nextDouble(); 
	}
	
	Integer[]idata = new Integer[20];
	Double[]idoubleData = new Double[20]; 
	for(int i = 0; i < idata.length; i++) {
		idata[i] = rnd.nextInt(1, 46); 
		idoubleData[i] = rnd.nextDouble();
	}
	
	
//	Mylist<Integer> data1 = new Mylist<>(data);  
	
	
	
	Arrays.sort(idata);
	showData(idata);
	System.out.println();
	
	Arrays.sort(idoubleData);
	showData(idoubleData);
	System.out.println();
	
	Arrays.sort(stringData);
	showData(stringData);
	//출력 
}
}
