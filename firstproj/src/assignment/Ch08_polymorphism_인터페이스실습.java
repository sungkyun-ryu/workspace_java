package assignment;

interface Shape1 {
	public double perimeter();
	public float area();
	@Override
	String toString();
}

class Triangle1 implements Shape1 {
	private int x1,y1,x2,y2,x3,y3;
	float side1, side2, side3 ;  

	public Triangle1(int x1, int y1, int x2, int y2, int x3, int y3) {

		this.x1 = x1; 
		this.y1 = y1; 
		this.x2 = x2; 
		this.y2 = y2; 
		this.x3 = x3; 
		this.y3 = y3; 	
	}

	@Override
	public double perimeter() { 
		side1 = (float)Math.pow(Math.abs(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)), .5);
		side2 = (float)Math.pow(Math.abs(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2)), .5);
		side3 = (float)Math.pow(Math.abs(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2)), .5);

		return side1 + side2 + side3;
	}

	@Override
	public float area() {
		return (float) 0.5 * (Math.abs(x1 * (y2-y3) + x2 * (y3-y1) + x3 * (y1-y2)));
	}
	
	public String toString() {
		 super.toString();
		 return "Three vertices are (" + x1 + ", " + y1 + ")" 
				 + ", (" + x2 + ", " + y2 + ")" 
				 + ", (" + x3 + ", " + y3 + ")." ;
		
	}
}


class Rectangle1 implements Shape1 {
	int x1,y1,x2,y2,x3,y3,x4,y4;
	double a ; 
	double b ;
	
	Rectangle1(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		this.x1 = x1; 
		this.y1 = y1; 
		this.x2 = x2; 
		this.y2 = y2;
		this.x3 = x3; 
		this.y3 = y3; 
		this.x4 = x4; 
		this.y4 = y4; 
		
		a= Math.abs(x1-x2);
		b= Math.abs(y1-y3);
	}

	@Override
	public double perimeter() {
		return 2 * (a+b); 
	}

	@Override
	public float area() {
		return (float) (a * b);
	}
	
	public String toString() {
		 super.toString();
		 return "Four vertices are (" + x1 + ", " + y1 + ")" 
				 + ", (" + x2 + ", " + y2 + ")" 
				 + ", (" + x3 + ", " + y3 + ")" 
				 + ", (" + x4 + ", " + y4 + ")." ;
	}
}


class Square1 extends Rectangle1 {


	public Square1(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int side) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		this.side = side; 
	}

	int side;

	public double perimeter() {
		if(a==b) return 2 * side;
		else return 0.0;
	}

	public float area() {
		if(a==b) return (float) side * side; 
		else return 0.0f;
	}
	
	public String toString() {
		return super.toString();		
	}
}


class Pentagon1 implements Shape1 {
	private int x1,y1,x2,y2,x3,y3,x4,y4,x5,y5;
	float side1, side2, side3, side4, side5;  
	
	Pentagon1(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5) {
		this.x1=x1; 
		this.y1=y1; 
		this.x2=x2;
		this.y2=y2; 
		this.x3=x3; 
		this.y3=y3; 
		this.x4=x4; 
		this.y4=y4; 
		this.x5=x5; 
		this.y5=y5; 
	}
	
	@Override
	public double perimeter() {
		side1 = (float)Math.pow(Math.abs(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2)), .5);
		side2 = (float)Math.pow(Math.abs(Math.pow(x3-x5, 2) + Math.pow(y3-y5, 2)), .5);
		side3 = (float)Math.pow(Math.abs(Math.pow(x5-x4, 2) + Math.pow(y5-y4, 2)), .5);
		side4 = (float)Math.pow(Math.abs(Math.pow(x4-x2, 2) + Math.pow(y4-y2, 2)), .5);
		side5 = (float)Math.pow(Math.abs(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)), .5);
		return side1 + side2 + side3 + side4 + side5;
	}

	@Override
	public float area() {
		return (float) (0.25 * Math.pow(5*(5+2*Math.pow(5, .5)), .5) * Math.pow(side1, 2)) ;
	}
	
	public String toString() {
		 super.toString();
		 return "Five vertices are (" + x1 + ", " + y1 + ")" 
				 + ", (" + x2 + ", " + y2 + ")" 
				 + ", (" + x3 + ", " + y3 + ")" 
				 + ", (" + x4 + ", " + y4 + ")"
				 + ", (" + x5 + ", " + y5 + ").";
	}
	
}

public class Ch08_polymorphism_인터페이스실습 {
	public static void main(String[] args) {


		Shape1 []arr = new Shape1[4];
		arr[0] = new Triangle1(1,2,3,4,5,6);
		arr[1] = new Rectangle1(1,2,3,2,1,5,3,5);
		arr[2] = new Square1(1,2,3,2,1,4,3,4,2);
		arr[3] = new Pentagon1(5,1,8,1,3,5,10,5,6,12);

		for(Object p : arr) {
			System.out.println(p.toString());
		}
		System.out.println("삼각형 둘레 길이 = " + arr[0].perimeter());
		System.out.println("삼각형 면적 = " + arr[0].area());
		System.out.println("사각형 둘레 길이 = " + arr[1].perimeter());
		System.out.println("사각형 면적 = " + arr[1].area());
	}
}

