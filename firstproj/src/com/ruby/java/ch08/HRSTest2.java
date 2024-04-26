package com.ruby.java.ch08;

public class HRSTest2 {

	public static void calcTax(Employee e) {
		if(e instanceof Salesman) {
			Salesman s1 = (Salesman) e;
			s1.annual_sales = 6500000; 
			System.out.println("Salesman's annual sales is: " + s1.annual_sales + ".");
		} else if(e instanceof Manager) {
			Manager m1 = (Manager) e; 
			m1.num_team = 5;
			System.out.println("Manager's number of teams is " + m1.num_team + ".");
		} else if(e instanceof Consultant) {
			Consultant c1 = (Consultant) e;
			c1.num_project = 35;
			System.out.println("Consultant's number of projects is " + c1.num_project + ".");
		} else {
			System.out.println("Type: Employee");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s = new Salesman();  ///타입은 Employee인데??? instanceof는 객체를 말하는건가??? 
		Manager m = new Manager(); 
		Consultant c = new Consultant(); 
		
		calcTax(s); 
		calcTax(m); 
		calcTax(c); 
	}

}
