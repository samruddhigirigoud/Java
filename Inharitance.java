package mypackage;
//Inheritance in java
class Parent{   //parent or super or drived class
	public void parent_method() {   //parent method
		System.out.println("I am parent method");
	}
}
class Child1 extends Parent{   //child or sub class
	public void child1_method() {  //child method
		System.out.println("i am child1 method");
	}
}
class Child2 extends Child1{   //child or sub class
	public void child2_method() {  //child method
		System.out.println("i am child2 method");
	}
class Main{
	public static void main(String[]args) {
		Child1 c = new Child1();
		c.parent_method();
		c,child1_method();
		Child2 c2 = new Child2();
		c2.child2_method();;
	}
}

//
class Dog {
    // Constructor matching class name without return type
    Dog() {
        System.out.println("bow..Boww..");
    }
}

class Cat extends Dog {
    // Method name starts with lowercase
    public void cat1() {
        System.out.println("Meoooo");
    }
}

class Human extends Cat {
    // Method name starts with lowercase
    public void human() {
        System.out.println("buck..buck");
    }
}

class Main {
    public static void main(String[] args) {
        // Creating object of Human class
        Human h = new Human();
        // Calling methods with correct case
        h.human();
        h.cat1();
    }
}
