package Main;
class Overloading{
	public static void add() { //normal method
		System.out.println("addition");
	}
	int add(int a,int b) { //parameterised method
		return a+b;
		
	}
	int add(int a,int b,int c) { 
		return a+b+c;
		
	}
}

public class Methodoverloading {
     public static void main(String[] args) {
    	 Overloading obj=new Overloading();
    	 obj.add(); // we can call the same obj for the different method in overloading but in constructor it is not possible we have to call the different obj
    	 //Overloading obj1=new Overloading();
    	 System.out.println("addition "+obj.add(10,20));
    	 //Overloading obj2=new Overloading();
    	 System.out.println("addition "+obj.add(10,20,30));
     }
}
