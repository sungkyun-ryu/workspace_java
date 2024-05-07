package assignment;
/*
 * 객체를 정렬하는 코드 완성 
 * 스트링 배열을 정렬
 * 객체 배열을 정렬 
 */
import java.util.Arrays;
import java.util.Comparator;
//import java.util.Random;

class Student1{
	String sno;
	String sname;
		
	Student1(String sno, String sname) {
		this.sno = sno; this.sname = sname;
	}
	
	public String toString() {
		return sname + " with id " + sno; 
	}
}

class SnoComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
    		return Integer.parseInt(s1.sno)-Integer.parseInt(s2.sno);
    }
}
public class test_객체배열정렬소스 {

	static void showData(String msg, Object[]data) {
		System.out.print(msg + ": ");
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i] + "  ");
		} 
		System.out.println();
	}
	public static void main(String[] args) {
		String [] stringData = {"apple","grape","blueberry","banana"};
		Student1 [] data = {
				new Student1("213", "홍길춘"),
				new Student1("9", "홍길홍"),
				new Student1("12", "홍길동"),
				new Student1("121", "홍길순"),
						};
		showData("정렬 전", stringData);
		Arrays.sort(stringData);
		showData("정렬 후", stringData);
		
		showData("정렬 전", data);
		Arrays.sort(data, new SnoComparator());
		showData("정렬 후", data);
	}

}
