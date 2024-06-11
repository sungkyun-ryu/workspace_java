package ch5;
/*
 * 미로 찾기 문제
 * 플라토의 미로 찾기 문제 설명 자료 학습
 * int input[12][15] 테이블에서 입구는 (0,0)이며 출구는 (11,14)임
 * 미로 테이블 (12,15)을 상하좌우 울타리를 친 maze[14][17]을 만들고 입구는 (1,1)이며 출구는(12,15)
 * stack을 사용한 backtracking 구현
 */

import java.util.ArrayList;
import java.util.List;


//23.2.16 수정
//23.2.24: 객체 배열 초기화, static 사용, 내부 클래스와 외부 클래스 사용 구분을 못하는 문제 => 선행 학습 필요
enum Directions {N, NE, E, SE, S, SW, W, NW}
class Items {
	int x;
	int y;
	int dir;

	public Items(int x, int y, int d) {
		this.x = x; 
		this.y = y; 
		this.dir = d;
	}

	@Override 
	public String toString() {
		return "(" + this.x + ", "+ this.y+ ")";
	}
}

class Offsets {
	int a;
	int b;

	public Offsets(int a, int b) {
		this.a = a ; this.b = b;
	}
}

class StackList {
	List<Items> stk ; 
	int top;
	int capacity;

	public StackList(int size) {
		this.capacity = size; 
		stk = new ArrayList<>() ; 
		top = 0 ;
	}

	class OverflowGenericStackException extends RuntimeException { 
		public OverflowGenericStackException() { 
			super(); 
		}
	}

	class EmptyGenericStackException extends RuntimeException{ 
		public EmptyGenericStackException() {
			super(); 
		}
	}

	//--- 스택에 x를 푸시 ---//
	public void push(Items x) throws OverflowGenericStackException {
		//구현
		if (top == capacity) 
			throw new OverflowGenericStackException(); 
		else {
			stk.add(x); 
			top += 1;
		}
	}

	//--- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	public Items pop() throws EmptyGenericStackException  {
		//구현
		if (top == 0)
			throw new EmptyGenericStackException(); 
		else {	
			--top;
			return stk.remove(top); 				
		}
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (top == 0 ) return true;
		return false;
	}	
}

public class Test_실습_미로찾기문제 {

	static Offsets[] moves = new Offsets[8];//static을 선언하는 이유를 알아야 한다

	public static void path(int[][] maze, int[][] mark, int ix, int iy) {

		
		mark[1][1] = 2;
		StackList st = new StackList(50);
		Items temp = new Items(0, 0, 0);//N :: 0
		temp.x = 1;
		temp.y = 1;
		temp.dir = 0;//E(동쪽부터):: if begins with 2, then N, NE will not be explored at the further points.
//		mark[temp.x][temp.y] = 2;//미로 찾기 궤적은 2로 표시
		st.push(temp);
		
		boolean path_find = false;

		while (!st.isEmpty()) // stack not empty
		{
			Items tmp = st.pop(); // unstack
			int i = tmp.x;
			int j = tmp.y;
			int d = tmp.dir;
			mark[i][j] = 0;//backtracking 궤적은 1로 표시			

			while (d < 8) // moves forward
			{	// outFile << i << " " << j << " " << d << endl;
				int g= i+moves[d].a ; int h=j+moves[d].b; 	
				
				if ((g == ix) && (h == iy)) { // reached exit
					// output path
					mark[i][j] = mark[g][h] = 2; 
					System.out.println("\nWe have found a PATH! \n");
					System.out.println("mark::");
					for (int k = 1; k <= 12; k++) {
						for (int l = 1; l <= 15; l++) {
							System.out.print(mark[k][l] + " ");
						}
						System.out.println();
					}
					path_find= true;
					break;
				}
				
				if ((maze[g][h] == 0) && (mark[g][h] == 0)) { // new position
					// push the old temp to the stack, but the direction changes.
					// Because the neighbor in the direction of d has been checked.
					tmp.dir = d+1; st.push(tmp); 
					mark[i][j] = 2;
					Items newPath = new Items(g, h, 0); st.push(newPath);
//					tmp.x = g; tmp.y=h; tmp.dir =0; st.push(tmp);					
//					mark[g][h] = 2; 
					break;
					
				} else
					// try next direction
					d = d+1; 	
			} 			
		}
		if (path_find == false) System.out.println("no path in maze ");
	}


public static void main(String[] args) {
	int[][] maze = new int[14][17];
	int[][] mark = new int[14][17];

	int input[][] = { // 12 x 15
			{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
			{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
			{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
			{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
			{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
			{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 },
			{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 }};

	for (int ia = 0; ia < 8; ia++)
		moves[ia] = new Offsets(0, 0);//배열에 offsets 객체를 치환해야 한다.
	moves[0].a = -1;	moves[0].b = 0;
	moves[1].a = -1;	moves[1].b = 1;
	moves[2].a = 0;		moves[2].b = 1;
	moves[3].a = 1;		moves[3].b = 1;
	moves[4].a = 1;		moves[4].b = 0;
	moves[5].a = 1;		moves[5].b = -1;
	moves[6].a = 0;		moves[6].b = -1;
	moves[7].a = -1;	moves[7].b = -1;
	//Directions d;
	//d = Directions.N;
	//d = d + 1;//java는 지원안됨

	for (int i = 0; i < 14; i++) {
		for (int j = 0; j < 17; j++) {
			//input[][]을 maze[][]로 복사
			if (i==0 || i==13) maze[i][j] = 1; 
			else {
				if(j==0 || j ==16) maze[i][j] = 1;
				else maze[i][j] = input[i-1][j-1];
			}
		}
	}

	System.out.println("maze[12,15]::");
	for (int i = 0; i <= 13; i++) {
		for (int j = 0; j <= 16; j++) {
			System.out.print(maze[i][j] + " ");
		}
		System.out.println();
	}
	
//	System.out.println("mark::");
//	for (int i = 0; i <= 13; i++) {
//		for (int j = 0; j <= 16; j++) {
//			System.out.print(mark[i][j] + " "); 
//		}
//		System.out.println();
//	}
	
	path(maze, mark, 12, 15); //출구번호 12, 15 
	
//	System.out.println("mark::");
//	for (int i = 1; i <= 12; i++) {
//		for (int j = 1; j <= 15; j++) {
//			System.out.print(mark[i][j] + " ");
//		}
//		System.out.println();
//	}

}
}
