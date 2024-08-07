package assignment;

//6장 실습 구현 - this 사용 생성자 구현 

class Employee1 {
	int pid;
	String name;
	int age;
	int eno;
	String dept;
	float salary;
	
	public Employee1() {
		this(0);
	}
	
	public Employee1(int pid) {
		this(pid, null); 
	}
	
	public Employee1(int pid, String name) {
		this(pid, name, 0);
	}
	
	public Employee1(int pid, String name, int age) {
		this(pid, name, age, 0) ;
	}
	
	public Employee1(int pid, String name, int age, int eno) {
		this(pid, name, age, eno, null);
	}
	
	public Employee1(int pid, String name, int age, int eno, String dept) {
		this(pid, name, age, eno, dept, 0);
	}
	
	public Employee1(int pid, String name, int age, int eno, String dept, float salary) {
		this.pid = pid; 
		this.name = name; 
		this.age= age; 
		this.eno = eno; 
		this.dept = dept; 
		this.salary = salary; 
	}
	
	
	@Override
	public String toString() {
		return "This employee's id: " + pid + ",   " 
			 + "name: " + name + ",   "
			 + "age: " + age + ",   "
			 + "eno: " + eno + ",   "
			 + "dept: " + dept + ",   "
			 + "salary: " + salary + ".";
	}

}
public class ch06_실습_Emp객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Employee1[]arr = new Employee1[5];
	  arr[0] = new Employee1();
	  arr[1] = new Employee1(3, "Park");
	  arr[2] = new Employee1(3, "Park", 30, 2001);
      arr[3] = new Employee1(4, "Choi", 35, 2002, "Engineering", 4000);
      arr[4] = new Employee1(5, "Kang", 22, 1003, "Physics", 4);
		for(Employee1 p : arr) {
			System.out.println(p.toString());
		}

	}

}
