package mypackage;

class Modi{
	public int a = 100;  //public
	protected int b = 200; //protected
	int c = 300;  //default
	private String name;  //private
//	private String name = "Raghav";  //if we not set name value her we have to use then setter method
	
	public String getName() {  //Getter Method
		return name;
	} 
	public void setName(String name) {
		this.name=name; 
	}
}
public class Modifiers {  //Main class
	public int a = 100; //public Non-Static so create obj to call else use Static and print below System.out.println("a value is :"+a)
	
	protected int b = 200; //protected
	
	int c = 300;  //Default
	
	private String name = "Raghav"; //private
	
	public static void main(String[]args) {
		Modifiers obj = new Modifiers();     //Main class Object
		System.out.println("a value is :"+obj.a);
		System.out.println("b value is :"+obj.b);
		System.out.println("c value is :"+obj.c);
		System.out.println("My name is :"+obj.name);
		
	Modi m = new Modi();                     //User define class Object
	System.out.println("a value is :"+m.a);
	System.out.println("a value is :"+m.b);
	System.out.println("c value is :"+obj.c);
//	System.out.println("My name is :"+); we can't access here without get set method
	
	m.setName("Raghav");
	
	System.out.println("My name is :"+m.getName());
	
	}

}
