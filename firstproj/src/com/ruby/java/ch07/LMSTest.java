package com.ruby.java.ch07;

import com.ruby.java.ch07.Employee;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee() ;
		Employee e1= new Employee("Jamie", 45, "Research") ;
		Professor p = new Professor();
		Student s = new Student();

		e.setName("Paul");
		e.setAge(47);
		e.setDept("Admissions");

		p.setName("Peter");
		p.setAge(52);
		p.setSubject("Data Centre");
		

		s.setName("Chris");
		s.setAge(20);
		s.setMajor("Computer Science");

		System.out.println(e1.toString());
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}