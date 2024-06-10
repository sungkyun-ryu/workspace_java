package ch4;
/*
 * 실습 4번 - 정수 배열 원형 큐
 * 교재 148 ~ 157 페이지
 * 교재 소스 코드를 보지 않고 구현 완성 연습 필요 
 */
import java.util.Random;
/*
 * 큐 1번 실습 코드 - 정수들의 큐
 */
import java.util.Scanner;

//import Chap4_스택과큐.IntQueue3.EmptyIntQueue3Exception;
//import Chap4_스택과큐.IntQueue3.OverflowIntQueue3Exception;

//int형 고정 길이 큐

class IntQueue3 {
	private int [] que; // 큐용 배열
	private int capacity; // 큐의 크기
	private int front; // 맨 처음 요소 커서
	private int rear; // 맨 끝 요소 커서
	boolean tag;
//	private int num; // 현재 데이터 개수

//--- 실행시 예외: 큐가 비어있음 ---//
	public class EmptyIntQueue3Exception extends RuntimeException {
		public EmptyIntQueue3Exception() {
			super(); 
		}
	}

//--- 실행시 예외: 큐가 가득 찼음 ---//
	public class OverflowIntQueue3Exception extends RuntimeException {
		public OverflowIntQueue3Exception() {
			super(); 
		}
	}

//--- 생성자(constructor) ---//
	public IntQueue3(int maxlen) {
		this.capacity = maxlen; 
		this.front = this.rear = 0; 
		this.tag = true;
		try {
			this.que = new int[maxlen];
		} catch(OutOfMemoryError e) {
			this.capacity = 0 ; 
		}		
	}

//--- 큐에 데이터를 인큐 ---//
	public void enque(int x) throws OverflowIntQueue3Exception {
		if(tag) {
			que[rear++] = x ; 
			if(rear%capacity == front)
				tag = false; 			 
		} else { 
			throw new OverflowIntQueue3Exception() ; 
		}
	}

//--- 큐에서 데이터를 디큐 ---//
	public int deque() throws EmptyIntQueue3Exception {
		if(!tag) {
			tag = true;
			return que[--rear]; 
		} else if(tag && rear==front) { 
			throw new EmptyIntQueue3Exception();
		} return -1; 
	}

//--- 큐에서 데이터를 피크(프런트 데이터를 들여다봄) ---//
	public int peek() throws EmptyIntQueue3Exception {
		if(tag && rear == front) {
			throw new EmptyIntQueue3Exception(); 
		} else {
			return que[front]; 
		}
	}

//--- 큐를 비움 ---//
	public void clear() {
		front = rear = 0  ;
		tag = true; 
	}

//--- 큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환 ---//
	public int indexOf(int x) {
		for(int i = front ; i < rear ; i++) {
			if (que[i] == x) 
				return i ;
			} return -1;
	}

//--- 큐의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

//--- 큐에 쌓여 있는 데이터 개수를 반환 ---//
	public int size() {
		return rear-front; 
	} 

//--- 큐가 비어있는가? ---//
	public boolean isEmpty() {
		if(tag && front == rear)
			return true;
		return false;
	}

//--- 큐가 가득 찼는가? ---//
	public boolean isFull() {
		if(!tag) return true;
		return false;
	}

//--- 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력 ---//
	public void dump() {
		for (int i = front; i < rear ; i++)
			System.out.print(que[i] + "\t");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue3 oq = new IntQueue3(4); // 최대 64개를 인큐할 수 있는 큐
		Random random = new Random();
		int rndx = 0, p = 0;
		boolean state = true;
		while (state) {
			System.out.println(" "); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", oq.size(), oq.getCapacity());
			System.out.print("(1)인큐　(2)디큐　(3)피크　(4)덤프　(0)종료: ");
			int menu = stdIn.nextInt();
			switch (menu) {
			case 1: // 인큐
				rndx = random.nextInt(20);
				System.out.print("입력데이터: (" + rndx +")");
				try {
					oq.enque(rndx);
				} catch(OverflowIntQueue3Exception e) {
					System.out.println("stack이 가득찼있습니다.");
				}
				break;

			case 2: // 디큐
				try {
					p = oq.deque();
					System.out.println("디큐한 데이터는 " + p + "입니다.");
				} catch (EmptyIntQueue3Exception e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					p = oq.peek();
					System.out.println("피크한 데이터는 " + p + "입니다.");
				} catch (EmptyIntQueue3Exception e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 4: // 덤프
				oq.dump();
				break;
			
			default:
				state = false; 
				break;
			}
		}
	}

}