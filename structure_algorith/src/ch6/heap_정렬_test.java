package ch6;

import java.util.Random;
import java.util.Scanner;

interface MaxHeap {
	public void Insert(int x);
	public int DeleteMax();
}

class Heap implements MaxHeap {
	final int heapSize = 100;
	private int[] heap;
	private int n; // MaxHeap의 현재 입력된 element 개수
	private int MaxSize; // Maximum allowable size of MaxHeap

	public Heap(int sz) {
		if(sz <= this.heapSize) {
			MaxSize = sz; n= 0; 
			heap = new int [MaxSize+1];	
		} else 
			System.out.println("Heap cannot have more than 100 elements");
	}

	public void display() {//heap 배열을 출력한다. 배열 인덱스와 heap[]의 값을 출력한다.
		System.out.print("[ ");
		for(int i=1; i < n+1; i++) {
			System.out.print(heap[i] + "(" +i + ")");	
			if (i != n) System.out.print(", ");
		}
		System.out.print(" ]");
		System.out.println("\n");
	} 

	@Override
	public void Insert(int x) {//max heap이 되도록 insert한다. 삽입후 complete binary tree가 유지되어야 한다.

		if (n == MaxSize) {
			HeapFull();
			return;
		} 
		else {
			heap[n+1] = x; int idx = n+1; 
			while(idx > 1) {
				int p_idx = idx/2; 
				if(heap[p_idx] < heap[idx]) { 
					int tmp = heap[p_idx]; heap[p_idx] = heap[idx]; heap[idx] = tmp; 
					idx = p_idx;
				} 
				else {idx = p_idx;}
			} n++; 			
		}
	}

	@Override
	public int DeleteMax() {//heap에서 가장 큰 값을 삭제하여 리턴한다. 	
		if (n == 0) {
			HeapEmpty();
			int elm = 0;
			return elm;
		} 
		
		else { 		
			int i = 1;  int j=2; int k=3; int x = heap[1];			
			while(n>0) {
				while(j <= 10 || k <= 10) {
					if(heap[j]>heap[k]) {
						heap[i] = heap[j]; i = j; j= i*2; k = (i*2) + 1;
					} else {
						heap[i] = heap[k]; i = k; j= i*2; k = (i*2) + 1;
					}
				}
				heap[i] = 0; n--;
				return x;			
			}return 0; 
		}
	}

	private void HeapEmpty() {
		System.out.println("Heap Empty");	
	}

	private void HeapFull() {
		System.out.println("Heap Full");
	}
}

public class heap_정렬_test {
	static void showData(int[] d) {
		System.out.print("[ ");
		for(int i = 0; i < d.length-1; i++) {
			System.out.print(d[i]);
			if (i != d.length-2) System.out.print(", ");
		} System.out.print(" ]\n\n");
	}

	public static void main(String[] args) {
		Random rnd = new Random();
		int select = 0; 
		Scanner stdIn = new Scanner(System.in);
		Heap heap = new Heap(20);
		final int count = 10;//난수 생성 갯수
		int[] x = new int[count+1];//x[0]은 사용하지 않으므로 11개 정수 배열을 생성한다 
		int []sorted = new int[count];//heap을 사용하여 deleted 정수를 배열 sorted[]에 보관후 출력한다

		do {
			System.out.println("Max Tree. Select: 1 insert, 2 display, 3 sort, 4 exit => ");
			select = stdIn.nextInt();
			switch (select) {
			case 1://난수를 생성하여 배열 x에 넣는다 > heap에 insert한다.
				for(int i=0; i < count; i++) {
					int rn= rnd.nextInt(100); x[i] = rn; heap.Insert(rn); 
				}
				showData(x);
				break;
			case 2:	//heap 트리구조를 배열 인덱스를 사용하여 출력한다.
				heap.display();
				break;
			case 3://heap에서 delete를 사용하여 삭제된 값을 배열 sorted에 넣는다 > 배열 sorted[]를 출력하면 정렬 결과를 얻는다 
				for(int i = 0; i < count; i++  ) {
					int a ; a = heap.DeleteMax();
					if(a > 0) sorted[i] = a; 
					else break;
				}
				System.out.print("[ "); 
				for(int b : sorted) {
					System.out.print(b + "  ");					
				} System.out.print("]\n\n");

				break;

			case 4:
				System.out.println("\nBYE"); 
				return; 

			}
		} while (select < 5);
		stdIn.close(); 
		return;
	}
}

