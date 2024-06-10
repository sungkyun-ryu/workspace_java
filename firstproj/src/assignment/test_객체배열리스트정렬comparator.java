package assignment;
///*

// */
import java.util.ArrayList;
/*
 * public interface Comparator<T>{
 *    int compare(T 01, T 02);
 *    }
 *    
 * public interface Comparable<T> {
 *   public int compareTo(T o);
 *   }   
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import org.xml.sax.ext.Attributes2;


class Student10 {
	String sno;
	String sname;

	public Student10 (String st1, String st2) {
		this.sno= st1; 
		this.sname= st2;
	}
	@Override
	public String toString() {
		return sno + ": " + sname;
	}
}


public class test_객체배열리스트정렬comparator {
	//	static void sortStudents() {
	//
	//	}
	static <T> void showStudents(String ss, T[] array ) {
		String[] arr= new String[array.length]; 
		for(int i=0; i<array.length; i++) {
			arr[i]= array[i].toString() ; 
		}
		System.out.println(ss + " " + Arrays.toString(array));
	}
	
	static void showStudents(String ss, ArrayList<Student10> lst) {
		System.out.print(ss + "= [");
		for(Student10 sx : lst)
			System.out.print(sx + ", ");
		System.out.print("] " + "\n");
//		String[] arr = new String[array.size()];
//		array.toArray(arr); 
//		for(int i=0; i<arr.length; i++) {
//			arr[i]= arr[i].toString() ; 
//		}
//		System.out.println(ss + " " + Arrays.toString(arr));
		
//		for(int i=0; i<array.size(); i++) {
//			System.out.print(array.get(i) + " ");
//		}
	}
	
	 static void sortStudents(Student10[] arr) {
		 //Comparator 구현완료
		 Comparator<Student10> compSno = new Comparator<Student10>(){
				@Override
				public int compare(Student10 s1, Student10 s2) {
					return Integer.parseInt(s1.sno) - Integer.parseInt(s2.sno) ;
				}
		 };
		 //Comparator 를 이용해서 sorting 완료
		Arrays.sort(arr, compSno);
	 }
	
	
	public static void main(String[] args) {


		Student10[] sArray = new Student10[5];

		// Student 객체 생성 및 배열에 할당
		sArray[0] = new Student10("121", "Alice");
		sArray[1] = new Student10("33", "Bob");
		sArray[2] = new Student10("9", "Charlie");
		sArray[3] = new Student10("2", "John");
		sArray[4] = new Student10("39", "Bobby");
		// ArrayList로 변환
		ArrayList<Student10> sList = new ArrayList<>();
		for (Student10 student : sArray) {
			sList.add(student);
		}
		showStudents("sno 정렬전", sArray);
		//문제1: Arrays.sort()를 사용한 sArray 정렬 - sno 사용, 익명클래스 사용
		//        Arrays.sort(sArray);
		//        
		Comparator<Student10> compSno = new Comparator<Student10>(){
			@Override
			public int compare(Student10 s1, Student10 s2) {
				return Integer.parseInt(s1.sno) - Integer.parseInt(s2.sno) ;
			}
		};

		Arrays.sort(sArray,compSno);

		//		Arrays.sort(sArray);
		showStudents("sno 정렬후", sArray);

		////////////////////////////////////

		showStudents("sname 정렬전", sArray);
		//문제2: Arrays.sort()를 사용한 sArray 정렬 - sname 사용, 익명 객체 사용: 참조 변수 없음
		Arrays.sort(sArray, (new Comparator<Student10>() {
			@Override
			public int compare(Student10 s1, Student10 s2) {
				return s1.sname.compareTo(s2.sname); 		     	
			}
		})
				);

		showStudents("sname 정렬후", sArray);

		///////////////////////////////////

		showStudents("sno 정렬전", sList);
		//문제3: Collections.sort()를 사용한 sList 정렬 - sno 사용, 람다식 사용
		Comparator<Student10> listcomp = (Student10 s1, Student10 s2) -> 
			Integer.parseInt(s1.sno) - Integer.parseInt(s2.sno);
		
		Collections.sort(sList, listcomp);
						
		showStudents("sno 정렬후", sList);

		///////////////////////////////////

		showStudents("sname 정렬전", sList);
////		문제4: Collections.sort()를 사용한 sList 정렬 - sname 사용
////		        Collections.sort(sList, null);
				
		Comparator<Student10> listnamecomp = (Student10 s1, Student10 s2) ->
			s1.sname.compareTo(s2.sname);
			
		Collections.sort(sList, listnamecomp);
		
		showStudents("sname 정렬후", sList);
		//////////////////////////////////

		showStudents("sno 정렬전", sArray);
		//문제5: sortStudents()를 사용한 sArray 정렬 - sno 사용
		sortStudents(sArray);
		
		showStudents("sno 정렬후", sArray);
	}

}
