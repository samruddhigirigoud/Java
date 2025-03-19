package mypackage;


//compile time poly  (Method overloading)

//class Polymorphism {
//	public static void add(int a , int B) {   //with same method name (add)passing differ parameters
//		System.out.println("Addition"+(a+b));
//	}
//	public static void add(double a , double B) {
//		System.out.println("Addition"+(a+b));
//	public static void main(String[]args) {
//		add(10,20);
//		add(100,200);
//	}
//}

//

//	class Polymorphism {
//		public static int add(int a , int B) {
//			return a+b;
//		}
//		public static add(double a , double B) {
//			
//		public static void main(String[]args) {
//			System.out.println(add(10,20));
//			add(100,200);
//		}
//	}

//Run time poly: (method overriding)
//
//class poly{ //parent class
//	public static void poly_method() {
//		System.out.println("Parent Method");
//	}
//}
//class poly_Child extends poly{  //child class
//	@Override
//	public void poly_method() {   //static method can not be override so take void only
//		System.out.println("Child Method");
//	}
//}
//public class Polymorphism{
//	poly_Child p = new poly_method() {
//		p.poly_method();
//	}
//}


package mypackage;

//Compile-time Polymorphism (Method Overloading)
class Polymorphism {
 // Method overloading with int parameters
 public static void add(int a, int b) { 
     System.out.println("Addition: " + (a + b));
 }

 // Method overloading with double parameters
 public static void add(double a, double b) {
     System.out.println("Addition: " + (a + b));
 }

 public static void main(String[] args) {
     add(10, 20); // Calls int method
     add(100.5, 200.3); // Calls double method
 }
}

//Run-time Polymorphism (Method Overriding)
class Parent {
 public void polyMethod() {
     System.out.println("Parent Method");
 }
}

class Child extends Parent {
 @Override
 public void polyMethod() {
     System.out.println("Child Method");
 }
}

public class PolymorphismDemo {
 public static void main(String[] args) {
     Parent p = new Child(); // Parent reference to Child object
     p.polyMethod(); // Calls Child's method due to dynamic binding
 }
}




















