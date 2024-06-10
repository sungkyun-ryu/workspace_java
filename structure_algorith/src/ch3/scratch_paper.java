package ch3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
 * 3장 5번 실습과제 - 스트링 리스트 정렬
 * 리스트를 배열로 변환후 중복제거후 다시 리스트 만들기 등 실습
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class scratch_paper  {

//	    public static String[] removeElement1(String[] arr, String item) {
//	    	//compare a[0] to a[i] i>0 and remove the same items.
//			//then compare a[1] to later ones.... repeat the procedure. 
//	    }
//	    
	   
	    
		public static void main(String[] args) throws IOException {
			
				Path input1 = Paths.get("a1.txt");
				byte[] bytes1 = Files.readAllBytes(input1);
				//readAllBytes: 파일의 모든 바이트를 읽어오는 메서드입니다. 
				//이 메서드는 파일을 열고 파일의 크기만큼 바이트를 읽어서 바이트 배열로 반환합니다.
				System.out.println("bytes[]의 길이 = "+bytes1.length);
				Path input2 = Paths.get("a2.txt");
				byte[] bytes2 = Files.readAllBytes(input2);
				
				String s1 = new String(bytes1);
				String s2 = new String(bytes2);
				System.out.println("입력 스트링: s1 = " + s1);
				System.out.println("입력 스트링: s2 = " + s2);
				
				System.out.println(bytes1[0]);
		}
}