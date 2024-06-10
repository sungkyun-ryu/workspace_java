package ch3;

/*
 * 3장 과제1: 스트링 배열 합병 정렬
 */
import java.util.Arrays;
//import java.util.List;
public class Test_스트링배열합병 {
	
	public static void showList(String msg, String[] data) {
		System.out.print("[ ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		} System.out.print(" ]" + "\n");
	}
	
	public static String[] mergeList(String[] d1, String[] d2) {
		int l1 = d1.length ; int l2 = d2.length; int l3 = l1 + l2; 
		String[] d3 = new String[l3];
		//d3에 스트링 넣기 from d1
		for(int i=0; i < l1; i++) 
			d3[i] = d1[i]; 
		//d3에 스트링 넣기 from d2
		for(int i=0; i < l2; i++) 
			d3[l1+i] = d2[i]; 
		Arrays.sort(d3);		
		return d3;
	}
	
    public static void main(String[] args) {
	String[] s1 = {"홍길동", "강감찬", "을지문덕", "계백", "김유신", "최치원" };
	String[] s2 = {"독도", "울릉도", "한산도", "영도", "오륙도", "동백섬"};
	Arrays.sort(s1);
	Arrays.sort(s2);
	
	showList("s1배열 = ", s1);
	showList("s2배열 = ", s2);

	String[] s3 = mergeList(s1,s2);//정렬된 s1[], s2[]을 합병하여 다시 정렬된 결과를 만드는 함수 구현
	showList("스트링 배열 s3 = s1 + s2:: ", s3);
    }
}
