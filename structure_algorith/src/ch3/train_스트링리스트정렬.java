package ch3;
/*
 * 3장 5번 실습과제 - 스트링 리스트 정렬
 * 리스트를 배열로 변환후 중복제거후 다시 리스트 만들기 등 실습
 */
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
import java.util.List;
public class train_스트링리스트정렬  {

//	    public static String[] removeElement1(String[] arr, String item) {
//	    	//compare a[0] to a[i] i>0 and remove the same items.
//			//then compare a[1] to later ones.... repeat the procedure. 
//	    }
	    
	    static void getList(List<String> list) {
	    	
			list.add("서울");	list.add("북경");
			list.add("상해");	list.add("서울");
			list.add("도쿄");	list.add("뉴욕");

			list.add("런던");	list.add("로마");
			list.add("방콕");	list.add("북경");
			list.add("도쿄");	list.add("서울");

			list.add(1, "LA");
	    }
	    static void showList(String topic, List<String> list) {
	    	System.out.print(topic + ": [ ");
	    	int n= list.size(); 
	    	for(int i = 0 ; i < n ; i++) {
	    		System.out.print(list.get(i) + " ");
	    	}
	    	System.out.print("]");
	    	System.out.println();
	    }
	    static void sortList(List<String> list) {
	    	//리스트를 배열로 변환 
	    	String[] arr = new String[list.size()];
	    	list.toArray(arr);
	    	Arrays.sort(arr);
	    	list.clear();
	    	list.addAll(Arrays.asList(arr));
	    }
	    	
	    
	    static String[] removeDuplicateList(List<String> list) {
	    	
	    	for(int i = 0 ; i < list.size() ; i++) {
		    	for(int j = i+1; j < list.size(); j++)
		    		if(list.get(i).equals(list.get(j)))
		    			{list.remove(j); 
		    			j--;
		    			}  		    			
		    }
	     	
	    	String cities[] = new String[list.size()];	 
 		    cities = list.toArray(cities) ;  
		    return cities; 
	    }
	    
	    
	       
	    
	    
		public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<>();
			getList(list);
			showList("입력후", list);
			//sort - 오름차순으로 정렬, 내림차순으로 정렬, 중복 제거하는 코딩

//		    Collections.sort(list);

//배열의 정렬
			sortList(list);
		    System.out.println();
		    showList("정렬후", list);
//// 배열에서 중복제거
		    System.out.println();
		    System.out.println("중복제거::");
//		  
		    String[] cities = removeDuplicateList(list);
	        ArrayList<String> lst = new ArrayList<>(Arrays.asList(cities));
		    
	        showList("중복제거후", lst);
		}
	}

