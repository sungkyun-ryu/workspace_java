package ch6;
//insertion sort 코드를 수정함: h 간격으로 건너서 삽입하는 방식이다 
import java.util.Random;

//셸 정렬(버전 1) 6-5
//https://travelbeeee.tistory.com/215

import java.util.Scanner;

class 실습6_6ShellSort {
 //--- 셸 정렬 ---//
 static void shellSort(int[] a, int n) {
	 int count = 0;
     for (int h = n / 2; h > 0; h /= 2)//n = 8 등 짝수일 때 4,2 등으로 효과가 적다
         for (int i = h; i < n; i++) {//h=2이면 i=2,3,4,5,6 등으로 반복
        	 //insertionSort() 구현 코드임
             int j;
             int tmp = a[i];
             for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {//j가 7이면 5,3,1로 반복
            	 count++;
                 a[j + h] = a[j];
             }
             a[j + h] = tmp;

         }
     System.out.println("\n비교횟수 = " + count);
 }
 static void showData(int[] d) {
     for (int i = 0; i < d.length; i++)
         System.out.print(d[i] + " ");
 }
 public static void main(String[] args) {
     Scanner stdIn = new Scanner(System.in);

     System.out.println("셸 정렬(버전 1)");
     System.out.print("요솟수: ");
     int nx = stdIn.nextInt();
   
     int[] x = new int[nx];
     
     Random rand = new Random();

     for (int i = 0; i < nx; i++) {
    	x[i] = rand.nextInt(999);
     }
     System.out.println("정렬전:");
     showData(x);

     shellSort(x, nx);            // 배열 x를 셸정렬
     System.out.println("정렬후:");
     showData(x);
  

 
 }
}
