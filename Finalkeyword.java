package Main;
class Car{
	public void carname() {
		System.out.println("car name is :audi");
	}
}
class Car1{
	final public void carprice() {
		System.out.println("car price is :2500000");
	}
}
class Car2{
	final public void carmodel() {
		System.out.println("car model is :2024");
	}
}

public class Finalkeyword {

	public static void main(String[] args) {
		Car c=new Car();
		c.carname();

	}

}
