package com.ruby.java.ch08;

//import com.ruby.java.ch07.abstraction.Consultant;
//import com.ruby.java.ch07.abstraction.Director;
//import com.ruby.java.ch07.abstraction.Employee;
//import com.ruby.java.ch07.abstraction.Manager;
//import com.ruby.java.ch07.abstraction.Salesman;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee {
	
	int annual_sales;
	
	public void calcSalary() {
		System.out.println("Salesman salary = basic + sales incentives");
	}

	public void calcBonus() {
		System.out.println("Salesman bonus= basic * 12 * 4");
	}
}

class Consultant extends Employee {
	
	int num_project;
	
	public void calcSalary() {
		System.out.println("Consultant salary = basic + consulting incentives");
	}

	public void calcBonus() {
		System.out.println("Consultant bonus = basic * 12 * 2");
	}
}

 class Manager extends Employee {
	 
	int num_team;
	 
	public void calcSalary() {
		System.out.println("Manager salary = basic + team incentives");
	}
	
	public void calcBonus() {
		System.out.println("Manager bonus = basic * 12 * 6");
	}
	
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director bonus = basic * 12 * 6");
	}
}

public class HRSTest {
	
	public static void calcTax(Employee e) {
		System.out.println("Tax is calculated... Pay the tax!");
	}
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		Object m1= new Manager(); 
		Employee m2= new Manager(); 
		Manager m3= new Manager(); 
				
		Object[] arr= new Object[6]; 
		arr[0] = s;
		arr[1] = c; 
		arr[2] = d; 
		arr[3] = m1; 
		arr[4] = m2; 
		arr[5] = m3; 
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
//		Manager m = new Manager(); 
//		s.calcSalary();
//		c.calcSalary();
//		d.calcSalary();
//		System.out.println();
//		
//		System.out.println(s.toString());
//		System.out.println(c.toString());
//		System.out.println(d.toString());
//		System.out.println();
//		
//		calcTax(s);
//		System.out.println();
//		
//		Salesman s2 = s; 
//		System.out.println(s2.toString());
//		System.out.println(s.toString());
//		if(s.equals(s2)) {
//			System.out.println("They are equal!");
//		} else {
//			System.out.println("They are different");
//		}
//		
		
		
	}
}
