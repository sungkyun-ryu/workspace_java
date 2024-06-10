package ch4;
/*
 * 실습 6번: 원형 큐로서 큐에 Point 객체를 배열로 저장
 * 실습4_3_2 정수 원형 큐 배열을 객체 버젼으로 구현하는 것임
 */


import java.util.Random;
import java.util.Scanner;

class Point5 {
	private int ix;
	private int iy;
	
	public Point5(int a, int b) {
		this.ix = a ; this.iy = b;
	}

	@Override
	public String toString() {
		return "( " + ix + ", " + iy + " )";
	}
}


class CircularQueue {
	static int QUEUE_SIZE = 0;
	Point5[] que;//배열로 객체원형 큐 구현
	int front, rear;
	static boolean isEmptyTag;
	
	//--- 실행시 예외: 큐가 비어있음 ---//
	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException(String msg) {
			super(msg);
		}
	}
	
	//--- 실행시 예외: 큐가 가득 찼음 ---//
	
	public class OverflowQueueException extends RuntimeException {
		public OverflowQueueException(String msg) {
			super(msg);
		}
	}

	public CircularQueue(int count) {
		QUEUE_SIZE = count; 
		que = new Point5[count]; 
		front = rear = 0 ; 
		isEmptyTag = true; 
	}
	
	void push(Point5 it) throws OverflowQueueException{
		if(isFull()) {
			throw new OverflowQueueException("push: circular queue overflow"); 
		} else {
			que[rear++] = it;
			if (rear%QUEUE_SIZE == front) 
				isEmptyTag = false;
		}
	}

	Point5 pop() throws EmptyQueueException{
		if(isEmpty()) {
			throw new EmptyQueueException("pop: circular queue empty"); 
		} else {
			return que[--rear]; 	
			}
	}

	 void clear() throws EmptyQueueException{
		if(isEmpty()) {
				throw new EmptyQueueException("clear: circular queue already empty"); 
		} else {
			front = rear = 0 ; 
			isEmptyTag = true; 
		}

	}

	//--- 큐의 크기를 반환 ---//
		public int getCapacity() {
			return QUEUE_SIZE;
		}

	//--- 큐에 쌓여 있는 데이터 개수를 반환 ---//
		public int size() {//front, rear를 사용하여 갯수를 size로 계산
			int queueSize = rear-front;

			return queueSize;
		}
		//--- 원형 큐가 비어있는가? --- 수정 필요//
		public boolean isEmpty() {
			if (isEmptyTag && front == rear)
				return true; 
			return false;
		}

	//--- 원형 큐가 가득 찼는가? --- 수정 필요//
		public boolean isFull() {
			if (!isEmptyTag) 
				return true; 
			return false;
		}

		public void dump() throws EmptyQueueException{
			if (isEmpty())
					throw new EmptyQueueException("dump: queue empty");
			else {
				for (int i = front; i < rear; i++) {
					System.out.println(que[i] + "\t");
				}
			}
		}
		public Point5 peek() throws EmptyQueueException {
			if (isEmpty())
				throw new EmptyQueueException("peek: queue empty"); // 큐가 비어있음
			else return que[rear-1];
		}
}

public class Test_실습4_3_4객체원형큐배열 {
public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	CircularQueue oq = new CircularQueue(4); // 최대 4개를 인큐할 수 있는 큐
	Random random = new Random();
	int rndx = 0, rndy = 0;
	Point5 p = null;
	while (true) {
		System.out.println(" "); // 메뉴 구분을 위한 빈 행 추가
		System.out.printf("현재 데이터 개수: %d / %d\n", oq.size(), oq.getCapacity());
		System.out.print("(1)인큐　(2)디큐　(3)피크　(4)덤프　(5) clear  (0)종료: ");
		int menu = stdIn.nextInt();
		if (menu == 0)
			break;
		switch (menu) {
		case 1: // 인큐

			rndx = random.nextInt(20);

			rndy = random.nextInt(20);
			System.out.print("입력데이터: (" + rndx + ", " + rndy + ")");
			p = new Point5(rndx,rndy);
			try {
				oq.push(p);
				System.out.println("push: size() = "+ oq.size());
			} catch(CircularQueue.OverflowQueueException e) {
				System.out.println("queue이 full입니다." + e.getMessage());
				e.printStackTrace();
			}
			break;

		case 2: // 디큐
			try {
				p = oq.pop();
				System.out.println("pop: size() = "+ oq.size());
			} catch (CircularQueue.EmptyQueueException e) {
				System.out.println("queue이 비어있습니다." + e.getMessage());
				e.printStackTrace();
			}
			break;

		case 3: // 피크
			try {
				p = oq.peek();
				System.out.println("피크한 데이터는 " + p + "입니다.");
			} catch (CircularQueue.EmptyQueueException e) {
				System.out.println("queue이 비어있습니다." + e.getMessage());
				e.printStackTrace();
			}
			break;
		case 4: // 덤프
			oq.dump(); 
			break;
			
		case 5: //clear
			oq.clear();
			break;
	}
	} stdIn.close(); 
}
}
	


