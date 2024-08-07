package assignment;


public class MyLinkedList_구현과제 {

	private Node head;
	public MyLinkedList_구현과제() {
		head = null;
	}
	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
		}
	}
	public void add(String data) {
		Node newNode = new Node(data); 

		if(head == null) {
			head = newNode; 
		}
		else {
			Node next = head ; 
			while(next.link != null) {
				next= next.link ; 
			}
			next.link = newNode; 
		}
	}


	public void printList() {
		//printList() 결과는 A -> B -> C 등으로 출력한다
		if(head==null) {
			System.out.println("No data registered.");
		} else {
			System.out.println("Here is registered data: ");
			Node next= head;
			while(next.link != null) {
				System.out.println(next.data);
				next = next.link; 
			} 

			System.out.println(next.data);			
		}
	}
	public void delete(String data) {
		Node next= head; 
		while(next.link != null) {
			if(next.link.data == data) {
				next.link = next.link.link;
			}
			next = next.link; 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList_구현과제 myList = new MyLinkedList_구현과제();
	

		myList.printList();
		System.out.println();

		myList.add("JAVA");
		myList.add("HTML");
		myList.add("CSS");
		myList.add("Javascript");
		myList.printList();
		System.out.println();

		myList.delete("CSS");
		myList.delete("HTML");
		myList.printList();
	}

}
