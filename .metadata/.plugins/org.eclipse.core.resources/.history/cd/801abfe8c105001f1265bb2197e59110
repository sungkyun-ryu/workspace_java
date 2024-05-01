package com.ruby.java.ch08;

interface Shape {
	public double perimeter();
	public float area();
	@Override
	String toString();
}

class Triangle implements Shape {
	private int x1,y1,x2,y2,x3,y3;
	@Override
	public double perimeter() { //구글링으로 계산식 찾아서 구현
		double sum = 0;
		return sum;}
	@Override
	public float area() {
		System.out.println();
	}
}
class Rectangle implements Shape {
	int x1,y1,x2,y2,x3,y3,x4,y4;
}
class Square extends Rectangle {
	int side;
}
class Pentagon implements Shape {
	private int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5;
}
public class Ch05_polymorphism_인터페이스실습 {
	Shape[]arr = new Shape[4];
	arr[0] = new Triangle(1,2,3,4,5,6);
	arr[1] = new Rectangle(1,2,3,2, 1,5,3,5);
	arr[2] = new Square(1,2,3,2,1,4,3,4,2);
	arr[3] = new Pentagon(5,1, 8,1,3,5,10,5,6,12);
	for(Object p : arr) {
		System.out.println(p.toString());
	}
	System.out.println("삼각형 둘레 길이 = " + t.perimeter());
	System.out.println("삼각형 면적 = " + t.area());
	System.out.println("사각형 둘레 길이 = " + r.perimeter());
	System.out.println("사각형 면적 = " + r.area());
}

