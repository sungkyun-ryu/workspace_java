package assignment;

abstract class Geometry {

	int[] xArr; // = new int[10];
	int[] yArr; // = new int[10];

	public abstract double getArea(); 
	public abstract double getLength(); 
}

class Point extends Geometry {

	public Point(int x1, int y2) {
		xArr = new int[2]; yArr= new int[2];
		super.xArr[0] = x1; 
		super.yArr[0] = y2; 
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		System.out.print("No Area: ");
		return 0;
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		System.out.print("No Length: ");
		return 0;
	}
}

class Line extends Geometry {

//	static int a1, b1, a2, b2;

	public Line(int x1, int y1, int x2, int y2) {
		xArr = new int[4]; yArr = new int[4]; 
		
		super.xArr[0] = x1; super.xArr[1] = x2; 
		super.yArr[0] = y1; super.yArr[1] = y2; 
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
//		System.out.print("No Area: ");
		return 0; 
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		//			System.out.print("The Length: ");
		//			double side1_2= Math.pow(super.xArr[0]-super.xArr[1], 2); 
		//			double side2_2= Math.pow(super.yArr[0]-super.yArr[1], 2);
		//			return Math.pow(side1_2+side2_2, .5); 		
//		a1= xArr[0]; a2= xArr[1]; 
//		b1= yArr[0]; b2= yArr[1]; 
		return Line.Length(xArr[0], yArr[0], xArr[1], yArr[1]); 

	}

	public static double Length(double a1, double b1, double a2, double b2) {
		double side1_2= Math.pow(Math.abs(a1-a2), 2); 
		double side2_2= Math.pow(Math.abs(b1-b2), 2);
		return Math.pow(side1_2+side2_2, .5); 		
	}

}

class Polyline extends Geometry {

	public Polyline(int...x) {
		int v= x.length/2; 
		xArr= new int [v]; yArr = new int[v];  
		
		for(int i=0; i<x.length; i++) {
			if(i%2 == 0) {
				xArr[i/2] = x[i]; 
			} else {
				yArr[(i-1)/2] = x[i]; 
			}
		}
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		double lensum = 0; 
		for(int i=1; i<xArr.length; i++) {
//			Line.a2= xArr[i]; Line.a1= xArr[i-1]; 
//			Line.b2= yArr[i]; Line.b1= yArr[i-1];  
			lensum += Line.Length(xArr[i-1], yArr[i-1], xArr[i], yArr[i]);  
		} return lensum;		
	}
	
}

//class Triangle extends Geometry {
//
//	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
//		xArr = new int[3]; yArr = new int[3]; 
//	}
//	@Override
//	public double getArea() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public double getLength() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//}

public class GeometryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line l= new Line(2,2,0,0); 
		System.out.println(l.getLength());
		
		Polyline pl= new Polyline(4,4,2,2,8,8);
		System.out.println(pl.getLength());
	}

}
