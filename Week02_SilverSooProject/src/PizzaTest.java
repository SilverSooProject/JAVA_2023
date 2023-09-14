class Circle{
	protected int radius;
	public Circle(int r) { radius = r; }
}

class Pizza extends Circle{
	String name;
	
	public Pizza(String name, int radius) {
		super(radius);
		this.name = name;
	}
	
	public void print() {
		System.out.println("피자 종류: "+name);
		System.out.println("지름: "+radius);
	}
}

public class PizzaTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();

	}

}