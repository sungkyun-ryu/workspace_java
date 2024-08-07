package com.ruby.java.ch14;
//일반 인터페이스 구현
/*
interface MyInterface{//Test01.java의 인터페이스 선언을 사용한다 
	void print();
}
*/
public class Test01_추가 {
//	/*
	public static MyInterface test3() {
		return new MyInterface() {
			@Override
			public void print() {
				System.out.println("hello");
			}
		};
	}
//	*/
	public static void main(String[] args) {
		MyInterface m = test3();
		//함수형 스타일의 람다식 구현 
		MyInterface m2 = ()->System.out.println("hello");//함수형 인터페이스 - 오직 한 메소드만 구현한다 
		m.print();
		m2.print();
	}

}
