package assignment;

abstract class Drinks{
	public abstract void drink();
}

class Juice extends Drinks {
	public void drink() {
		System.out.println("주스를 마십니다");
	}
}

class Coffee extends Drinks{
	public void drink() {
		System.out.println("커피를 마십니다");
	}
}

class Beer extends Drinks{
	public void drink() {
		System.out.println("맥주를 마십니다");
	}
}

class Water extends Drinks{
	public void drink() {
		System.out.println("물을 마십니다");
	}
}

class Tea extends Drinks{
	public void drink() {
		System.out.println("차를 마십니다");
		}
}


public class DrinkOrder {
	public static void main(String[] args) {
		Juice j = new Juice(); 
		Coffee c= new Coffee(); 
		Beer b = new Beer(); 
		Water w = new Water(); 
		Tea t = new Tea();
		
		Drinks[] drinks = {j,c,b,w,t}; 
		
		for(Drinks d: drinks) {
			d.drink();
		}
	}

}
