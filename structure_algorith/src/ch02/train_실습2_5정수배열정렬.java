package ch02;

import java.util.Arrays;
//교재 67 - 실습 2-5
//2번 실습
import java.util.Random;
public class train_실습2_5정수배열정렬 {
	static int top = 0;
	static final int MAX_LENGTH = 20;
	public static void main(String[] args) {
		float []data = new float[MAX_LENGTH];// 0.0 ~ 1.0 사이의 실수를 저장
		inputData(data, 10);//10개의 난수를 입력
		showData(data);//top 개수 만큼 출력

		reverse(data);//역순으로 재배치 - 교재 67페이지 참조
		System.out.println(Arrays.toString(data));// 교재 84페이지 코드 참조
		//
		sortData(data);//교재 205 bubbleSort() 함수 코드를 사용 - 올림차순으로 정렬
		showData(data);
		Random randf = new Random(); 
		float realData = randf.nextFloat((float)1.0); //실수 난수 생성;
		insertData(data, realData);//역순으로 재배치 - 정렬 아님
		showData(data);
	}

	static void showData(float[] data) {//실수 배열을 top 갯수만 출력

		System.out.print("[");
		for (int i = 0 ; i < top; i++)		
			if (i != top-1)
				System.out.print(data[i] + ", ");
			else
				System.out.print(data[i]);
		System.out.println("]");
	}		


	static void inputData(float []data, int val) {
		//난수 실수를 입력
		Random rand = new Random(); 
		for (int i=0; i < val; i++) {
			data[i] =rand.nextFloat((float) 1.0);
		}
		top += val;
	}

	static void reverse(float[] data) {//역순으로 재배치
		for (int i=0; i < top / 2 ; i++) 
			swap(data, i, top - 1 - i);
	}

	static void swap(float[] data, int idx1, int idx2) {//교재 67페이지 - 맞교환
		float a = data[idx1]; data[idx1] = data[idx2]; data[idx2] = a ; 
	}

	static void sortData(float[]data) {//올림차순으로 정렬
		for (int i = 0 ; i < top - 1 ; i++)
			for (int j = top - 1; j > i ; j--)
				if(data[j-1] > data[j])
					swap(data, j-1, j); 
	}

	static void insertData(float[] data, float val) {//insert되는 실수 값이 insert될 위치를 찾아 보다 큰 값은 우측으로 이동
		for (int i = 0; i < top; i++) {
			if (val < data[i]) {
				for (int j = top-1; j >= i ; j--)
					data[j+1] = data[j];	
				data[i] = val; break;
			}	
			
		}
		top += 1; 
	}


}
