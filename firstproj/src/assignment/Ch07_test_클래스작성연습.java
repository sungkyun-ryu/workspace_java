package assignment;
//7장 실습 구현 
abstract class Person {
	int pid;
	String name;
	int age;
	
	public abstract String toString() ;
}

class Student extends Person {
	//sid, dept, year
	int sid; 
	String dept; 
	int year; 
	//super 사용
	
//	public Student () {
//		this(0) ; 
//	}
	
//	public Student (int pid) { 
//		this(pid, null) ; 
//	}
	
	public Student (int pid, String name) {
		this(pid, name, 0, 0); 
	}
	
//	public Student (int pid, String name, int age) {
//		this(pid, name, age, 0);
//	}
//	
	public Student (int pid, String name, int age, int sid) {
		this(pid, name, age, sid, null, 0);
	}
	
//	public Student (int pid, String name, int age, int sid, String dept) {
//		this(pid, name, age, sid, dept, 0) ; 
//	}
	
	public Student(int pid, String name, int age, int sid, String dept, int year) {
		this.sid = sid; 
		this.dept = dept; 
		this.year = year; 
		super.pid = pid; 
		super.name = name; 
		super.age = age; 
	}
	
	@Override
	public String toString() {
		return "This student's pid: " + super.pid + ",  "
				+ "name: " + super.name + ",  " 
				+ "age: " + super.age + ",  " 
				+ "sid: " + sid + ",  " 
				+ "dept: " + dept + ",  "
				+ "year: " + year + "." ;
	}
}
class Employee extends Person {
	//eno, dept, salary
	int eno; 
	String dept; 
	float salary; 
	//super 사용
	
//	public Employee () {
//		this(0) ; 
//	}
//	
////	public Employee (int pid) { 
////		this(pid, null) ; 
////	}
//	
//	public Employee (int pid, String name) {
//		this(pid, name, 0); 
//	}
//	
//	public Employee (int pid, String name, int age) {
//		this(pid, name, age, 0);
//	}
//	
//	public Employee (int pid, String name, int age, int eno) {
//		this(pid, name, age, eno, null);
//	}
//	
//	public Employee (int pid, String name, int age, int eno, String dept) {
//		this(pid, name, age, eno, dept, 0) ; 
//	}
	
	public Employee (int pid, String name, int age, int eno, String dept, int salary) {
		this.eno = eno; 
		this.dept = dept; 
		this.salary = salary; 
		super.pid = pid; 
		super.name = name; 
		super.age = age; 
	}
	public String toString() {
		return "This student's pid: " + super.pid + ",  "
				+ "name: " + super.name + ",  " 
				+ "age: " + super.age + ",  " 
				+ "sid: " + eno + ",  " 
				+ "dept: " + dept + ",  "
				+ "year: " + salary + "." ;
	}
}
public class Ch07_test_클래스작성연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person arr[] = new Person[5];
        arr[0] = new Student(1, "Kim");
        arr[1] = new Student(2, "Lee", 21, 1002);
        arr[2] = new Employee(3, "Park", 30, 2001, "HR", 3000);
        arr[3] = new Employee(4, "Choi", 35, 2002, "Engineering", 4000);
        arr[4] = new Student(5, "Kang", 22, 1003, "Physics", 4);
		
        for(Person p : arr) {
			System.out.println(p.toString());
		}
	}
	
}

