package ch02;

//메소드에 배열 전달 실습: 교재 59 - 메소드의 매개변수로 배열 사용하기
//function parameters를 작성할 수 있어야 한다 
import java.util.Random;
public class train_실습2_4메소드배열전달 {
	static int top = 0;
	static final int MAX_LENGTH = 20;
	public static void main(String[] args) {
		int []data = new int[MAX_LENGTH];
		inputData(data, 10);//100 이하 난수로 10개 정수를 입력받는다
		showData(data);
		int max = findMax(data);//최대값을 찾는다, 교재 58페이지 실습2-3 참조
		System.out.println("\nmax = " + max);
		boolean existValue = findValue(data, 3); //배열에 3이 있는지 찾는다
		System.out.println("찾는 값 = " + 3 + ", 존재여부 = " + existValue);
	}
	static void showData(int []data) {
		//top 갯수까지 출력한다 [1,2,3]등으로 출력하도록 작성
		System.out.print("[");
		for (int i = 0 ; i < top; i++)		
			if (i != top-1)
				System.out.print(data[i] + ", ");
			else
				System.out.print(data[i]);
		System.out.println("]");
	}
	static void inputData(int[]data, int count) {//교재 63 - 난수의 생성
		//top이 배열에 저장된 갯수를 저장
		Random rnd = new Random();
		for (int i = 0 ; i < count; i++)
			data[i] = rnd.nextInt(100); 
		top =+ count; 
	}
	static int findMax(int[] data) {
		//최대값을 리턴한다 
		int maxval = data[0] ;
		for (int i = 0; i < top; i++) {
			 
			if (maxval < data[i]) 
				maxval = data[i];
		}
		return maxval;
	}
	
	static boolean findValue(int[] data, int val) {
		boolean result = false;
		//items[]에 value 값이 있는지를 찾아 존재하면 true, 없으면 false로 리턴
		for (int i=0; i < top; i++) {
			if (data[i] == val)
				result = true ;	
		}	
		return result; 
	}

}
