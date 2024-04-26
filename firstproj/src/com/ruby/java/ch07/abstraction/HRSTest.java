package com.ruby.java.ch07.abstraction;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman salary = basic + sales incentives");
	}

	public void calcBonus() {
		System.out.println("Salesman bonus= basic * 12 * 4");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant salary = basic + consulting incentives");
	}

	public void calcBonus() {
		System.out.println("Consultant bonus = basic * 12 * 2");
	}
}

abstract class Manager extends Employee {
	public void calcSalary() {
		System.out.println("Manager salary = basic + team incentives");
	}

}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director bonus = basic * 12 * 6");
	}
}

public class HRSTest {
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
//		Manager m = new Manager(); 
		s.calcSalary();
		c.calcSalary();
		d.calcSalary();
	}
}
