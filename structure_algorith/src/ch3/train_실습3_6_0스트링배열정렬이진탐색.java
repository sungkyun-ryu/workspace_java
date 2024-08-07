package ch3;

/*
 * 3장 2번 실습과제 - 스트링 배열의 정렬과 이진검색 
* 교재 121 실습 3-6 
* 함수(메소드)에 parameter 전달 방식을 표현하는 능력의 숙달 훈련
* 함수(메소드) 전체를 작성하는 훈련 
*/
import java.util.Arrays;
public class train_실습3_6_0스트링배열정렬이진탐색 {
    static void showData(String msg, String[] data) {
    	System.out.print(msg + "[ ");
    	for (int i = 0 ; i < data.length; i++) {
    		System.out.print(data[i] + ", ");
    	}
    	System.out.print(" ]");
    	System.out.println("");
    }
    
    static void swap(String [] data, int idx1, int idx2) {
    	String a = data[idx1]; data[idx1] = data[idx2] ; data[idx2] = a; 
    }
	
    static void sortData(String[] data) {
    	int n= data.length ; 
    	for (int i = 0 ; i < n; i++) {
    		int min = i; 
    		for (int j = i+1 ; j < n ; j++) {
    			if(data[j].compareTo(data[min]) < 0) {
    				min = j ; 
    			}
    		} swap(data, i, min) ; 
    	}
    }
    
    static int linearSearch(String[] data, String k) {
    	int n = data.length; 
    	for (int i = 0 ; i < n ; i++) {
    		if(data[i] == k) {
    			return i ; 
    		}    		
    	} return -1;
    }
	
    static int binarySearch(String[] data, String k) {
    	int b = 0 ; int e = data.length-1; 
    	
    	while(b <= e) {
    		int m = (b+e) / 2 ; 
    		if (data[m] == k) 
    			return m ;
    		 else if(data[m].compareTo(k) < 0)
    			b = m+1;     			
    		 else 
    			e = m-1;    		
    	} return -1;    	
    }
	
	public static void main(String[] args) {
		String []data = {"사과","포도","복숭아", "감", "산딸기", "블루베리", "대추", "수박", "참외"};
		showData("정렬전", data);
		sortData(data);//올림차순으로 정렬 교재211-212 단순 선택 정렬 알고리즘으로 구현
		showData("정렬후", data);

		String key = "포도";
		int resultIndex = linearSearch(data, key);//교재 100 페이지 seqSearch() 함수로 구현
		System.out.println("\nlinearSearch(포도): key = " + key + ", result 색인 = " + resultIndex);

		key = "배";
		resultIndex = binarySearch(data, key);//교재 109 페이지 binSearch() 함수로 구현
		System.out.println("\nbinarySearch(배):key = " + key + ",  result = " + resultIndex);
		key = "산딸기";
		/*
		 * 교재 115 Arrays.binarySearch에 의한 검색
		 */
		resultIndex = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(산딸기): key = " + key + ", result = " + resultIndex);
	}
}
