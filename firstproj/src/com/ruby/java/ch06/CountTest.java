package com.ruby.java.ch06;

class Count{
	public static int totalCount; 
	private int num;
	public void print() {
		System.out.println("num= " + num);
	}
	public static void print2() {
		System.out.println("totalCount= " + totalCount);
	}
	public Count() {
		num= 1;
		totalCount++;
	}
	int getter() {
		return num;
	}
	void setter(int n) {
		num += num; 
	}
}

public class CountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Count.totalCount);
		Count c[]= new Count[3]; 
		for(int i=0; i<c.length; i++) {
			c[i]= new Count(); 
//		System.out.println(c[2].totalCount);
//		System.out.println(c[i].getter());
			c[i].print();
		}
		Count.print2();
	}

}
