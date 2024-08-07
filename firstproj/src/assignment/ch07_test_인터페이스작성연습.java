package assignment;
/*
 * 7장 실습 코드로 구현한다 
 */

interface Shape {
	public double perimeter();
	public float area();
}

class Triangle implements Shape {
	private int x1,y1,x2,y2,x3,y3;
	float side1, side2, side3; 

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {

		this.x1 = x1; 
		this.y1 = y1; 
		this.x2 = x2; 
		this.y2 = y2; 
		this.x3 = x3; 
		this.y3 = y3; 

	}
	@Override
	public double perimeter() { //구글링으로 계산식 찾아서 구현

		side1 = (float)Math.pow(Math.abs(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)), .5);
		side2 = (float)Math.pow(Math.abs(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2)), .5);
		side3 = (float)Math.pow(Math.abs(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2)), .5);

		return side1 + side2 + side3;}

	@Override
	public float area() {
		return (float) (0.5) * (Math.abs(x1 * (y2-y3) + x2 * (y3-y1) + x3 * (y1-y2)));
	}
}


class Rectangle implements Shape {

	int x1,y1,x2,y2,x3,y3,x4,y4;
	double a ; 
	double b ;

	public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		this.x1 = x1; 
		this.y1 = y1;
		this.x2 = x2; 
		this.y2 = y2;
		this.x3 = x3; 
		this.y3 = y3;
		this.x4 = x4; 
		this.y4 = y4; 
		
		a = Math.abs(x1-x2);
		b = Math.abs(y1-y3);
	}

	public double perimeter() {
		return 2 * (a+b); 
	}

	public float area() {
		return (float) (a * b);
	}
}

class Square extends Rectangle {

	int side;

	public Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int side) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		this.side = side; 
	}

	public double perimeter() {
		if(a==b) {		
			return side = 2 * side; 
		}
		else {
			System.out.println("This is a rectangle, NOT a square");
			return 0.0;
		}
	}

	public float area() {
		if(a==b) return (float) side * side; 
		else {
			System.out.println("This is a rectangle, NOT a square");
			return 0.0f;
		}
	}
}

public class ch07_test_인터페이스작성연습 {
	public static void main(String[] args) {


		Shape t = new Triangle(0,0,8,0,0,8);
		Shape r = new Rectangle(1,2,3,2,1,5,3,5);
		Shape s = new Square(1,2,3,2,1,5,3,5,2);

		System.out.println("삼각형 둘레 길이 = " + t.perimeter()); 
		System.out.println("삼각형 면적 = " + t.area() + "\n");
		System.out.println("사각형 둘레 길이 = " + r.perimeter());
		System.out.println("사각형 면적 = " + r.area() + "\n");
		System.out.println("정사각형 둘레 길이 = " + s.perimeter());
		System.out.println("정사각형 면적 = " + s.area() + "\n");;
	}
}

