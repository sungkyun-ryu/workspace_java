package ch3;

/*
 * 3장 3번 실습과제 - 객체 배열의 정렬과 이진검색 - Comparable 구현
 * 함수(메소드)에 parameter 전달 방식을 표현하는 능력의 숙달 훈련
 * 함수(메소드) 전체를 작성하는 훈련 
 */
import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData2 implements Comparable<PhyscData2>{
	String name;
	int height;
	double vision;
	
	PhyscData2 (String name, int height, double vision) {
		this.name = name; this.height = height; this.vision = vision;
	}	

	@Override
	public String toString() {//[홍길동,162,0.3] 형태로 리턴한다 //inherited from Object
		return "[" + name + ", " + height + ", " + vision + "]";  
	}
	@Override
	public int compareTo(PhyscData2 p) {// abstract method of Comparable
		int n = this.name.compareTo(p.name); 
		double m ;
		if (n!= 0) 
			return n; 
		else 
			n = this.height - p.height; 
			if (n != 0) 
				return n ; 
			else 
				m = this.vision - p.vision; 
				return (int) m; 
	}	
	@Override
	public boolean equals(Object obj) { //inherited by Object
		 PhyscData2 data = (PhyscData2) obj; 
		 if (this.compareTo(data) == 0) 
			 return true; 
		 else 
			 return false;		
	}

}
public class train_실습3_6_1객체배열이진탐색 {
	public static void main(String[] args) {
		PhyscData2[] data = {
				new PhyscData2("홍길동", 162, 0.3),
				new PhyscData2("나동", 164, 1.3),
				new PhyscData2("최길", 152, 0.7),
				new PhyscData2("홍길동", 162, 0.3),
				new PhyscData2("박동", 182, 0.6),
				new PhyscData2("박동", 167, 0.2),
				new PhyscData2("길동", 167, 0.5),
		};
		showData("정렬전", data);
		sortData(data);//6장 06-4 단순 삽입 정렬 InsertionSort() 함수로 구현
		showData("정렬후", data);
		reverse(data);
		showData("역순 재배치후", data);
		Arrays.sort(data);//사용된다 그 이유는? 이해가 되어야 한다 
		showData("Arrays.sort() 정렬후", data);
		
		PhyscData2 key = new PhyscData2("길동", 167, 0.5);
		int resultIndex = linearSearch(data, key);
		System.out.println("\nlinearSearch(<길동,167,0.5>): result index = " + resultIndex);
		
		key = new PhyscData2("박동", 167, 0.6);
		/*
		 * 교재 109~113
		 */
		resultIndex = binarySearch(data, key);//comparable를 사용
		System.out.println("\nbinarySearch(<박동,167,0.6>): result index = " + resultIndex);
		key = new PhyscData2("나동", 164, 0.6);
		/*
		 * 교재 115 Arrays.binarySearch에 의한 검색
		 */
		resultIndex = Arrays.binarySearch(data, key);//comparable를 사용
		System.out.println("\nArrays.binarySearch(<나동,164,0.6>): result index = " + resultIndex);
	}
	
	private static void showData(String string, PhyscData2[] data) {
		// TODO Auto-generated method stub
		int n = data.length; 
		System.out.print(string + " ");
		for (int i = 0 ; i < n ; i++) {
			System.out.print(data[i].toString() + ", ");
		}
		System.out.println();
	}
	
	private static void sortData(PhyscData2[] data) {
		// TODO Auto-generated method stub
		int n = data.length ; 
		for (int i = 1 ; i < n ; i++) {
			int j ;
			PhyscData2 tmp = data[i]; 
			for (j = i; j > 0 && data[j-1].compareTo(tmp) > 0; j--) 
				data[j] = data[j-1] ; 
			data[j] = tmp; 
		}
	}
	
	private static void reverse(PhyscData2 [] data) {
		int n = data.length; 
		for (int i = 1 ; i < n; i++) {
			int j ; 
			PhyscData2 tmp = data[i] ; 
			for(j = i; j > 0 && data[j-1].compareTo(tmp) < 0; j--)
				data[j] = data[j-1] ; 
			data[j] = tmp; 
		}
	}
	
	private static int linearSearch(PhyscData2[] data, PhyscData2 p) {
		int n = data.length; 
		for (int i = 0 ; i < n; i++) {
			if (data[i].name == p.name && data[i].height == p.height && data[i].vision == p.vision)
				return i;
		}
		return -1; 
	}
	
	private static int binarySearch(PhyscData2[] data, PhyscData2 p) {
		int b = 0; int e =0 ; 
		while(b<=e) {
			int m = (b+e)/2 ; 
			if (data[m].equals(p)) 
				return m;
			else if (data[m].compareTo(p) < 0)
				b= m+1; 
			else
				e= m-1; 
		} return -1;
	}
}
