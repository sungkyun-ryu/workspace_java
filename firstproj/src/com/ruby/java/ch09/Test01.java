package com.ruby.java.ch09;

class MyObject { 
	
	int num;
	
	MyObject() {	}
	
	MyObject(int num) {
		this.num = num;
	}
	
	public String toString() {
		return "Understood?"; 
	}
	
	public boolean equals(Object obj) { 
		boolean result = false; 
		MyObject arg = (MyObject) obj; 
			if(arg.num == this.num) {
				result = true; 
			}
			return result; 
	}
}

public class Test01 {
	
	public static void main(String[] args) {
		Object obj1 = new Object(); 
		Object obj2 = new Object(); 
		Object obj3 = new Object(); 
//		
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
//		System.out.println(obj3.hashCode());
//		
		Class c= obj1.getClass();
//		System.out.println(c.getClass());
		
		MyObject obj4 = new MyObject(123); 
		MyObject obj5 = new MyObject(123);
		MyObject obj6 = new MyObject() ; 
		
//		System.out.println(obj2);
		
		System.out.println();
		
		if(obj4.equals(obj1)) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");
		} // 다른 hashcode를 가지고 있다
		
		System.out.println(obj6.num);
		
		System.out.println(obj4.hashCode());
		System.out.println(obj6.hashCode());
		
//		if(obj4 == obj5) {
//			System.out.println("동일 객체");
//		} else {
//			System.out.println("다른 객체");
//		}

		
	}
	

}
