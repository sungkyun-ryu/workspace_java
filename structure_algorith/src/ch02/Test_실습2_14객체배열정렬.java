package ch02;

//import java.util.Arrays;

//5번 실습 - 2장 실습 2-10를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData>{
	String name;
	int height;
	double vision;
	
	public PhyscData(String name, int height,double vision) {
		this.name = name;
		this.height = height; 
		this.vision = vision;
	}

	@Override
	public String toString() {
		return "Name: "+ name +", height: " + height + ", vision: " + vision;
	}
	@Override
	public int compareTo(PhyscData p) {
		int n= name.compareTo(p.name);
		if (n!=0) {
			return n;
		} else {
			int h= height - p.height;
			if (h !=0 ) {
				return h; 
			} else {
				double v = p.vision - vision; 
				if(v!=0) {
					return (int)v; 
				} else {
					return 0;
				}
			}
		}
	}
	
	public boolean equals(PhyscData p) { ///Why not error? Override가 아님 
		if(compareTo(p) == 0) {
			return true;
		} else {
			return false;
		}
	}	
}


public class Test_실습2_14객체배열정렬 {
	
	static void swap(PhyscData[] data, int idx1, int idx2) {
		PhyscData a = data[idx1]; data[idx1] = data[idx2] ; data[idx2] = a;
	}
	static void sortData(PhyscData[] data) {//객체 배열을 이름 순서로 정렬, 이름이 같으면 키 값을 정렬, 키 값이 같으면 시력으로 
		for(int i = 0 ; i < data.length - 1 ; i++) {
			for (int j= data.length - 1; j > i ; j--) {
				if(data[j].compareTo(data[j-1]) < 0) {
					swap(data, j-1, j) ; 
				}
			}
		}
	}
	public static void main(String[] args) {
		PhyscData[] data = {
				new PhyscData("홍길동", 162, 0.3),
				new PhyscData("홍동", 164, 1.3),
				new PhyscData("홍길동", 162, 0.7),
				new PhyscData("김홍길동", 172, 0.3),
				new PhyscData("이길동", 182, 0.6),
				new PhyscData("이길동", 167, 0.2),
				new PhyscData("최길동", 169, 0.5),
		};
		showData("정렬전",data);
		sortData(data);
		showData("정렬후", data);
		PhyscData[] newData= insertObject(data, new PhyscData("이기자", 179, 1.5));//배열의 사이즈를 1개 증가시킨후 insert되는 객체 보다 큰 값들은 우측으로 이동, 사이즈가 증가된 객체 배열을 리턴
		showData("삽입후", newData);
	}
	static void showData(String msg, PhyscData[] data) {
		System.out.println(msg);
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i].toString());
		}
	}
	static PhyscData[] insertObject(PhyscData[] data, PhyscData a){//배열의 사이즈를 1개 증가시킨후 insert되는 스트링 보다 큰 값들은 우측으로 이동, 사이즈가 증가된 스트링 배열을 리턴
		int n = data.length;
		PhyscData [] b = new PhyscData[n+1]; 
		for (int i = 0; i < n; i++) {
			b[i] = data[i];
		}
		b[n] = a; 
		sortData(b); 
		return b; 
	}

}
