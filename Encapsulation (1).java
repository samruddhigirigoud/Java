package mypackage;

public class Encapsulation {  //user define class
	private static String name = "Aditya";
	
	
	public String getName() {
		return name;
	}

}
public class Main{    //main class
	public static void main(String []args) {  //main method
//		Encapsulation e = new Encapsulation();   //object creation is failed here so geter and seter method can be used to access.
//		System.out.println(e.name);
		
		Encapsulation e = new Encapsulation();
		System.out.println(e.getName);
	}
}

//Getter and setter Methods

class Encapsulation{
	private int a = 100;  //getter is enough bcz value is initiallized
	private string name = "Aditya";  //getter is enough bcz value is initiallized
	private String loc;  //getter and setter is recquired
	
	public int getID() {  //getter method1
		return id;
	}
	public String getName() { //getter method2
		return name;
	}
	public void setLoc(String loc) {  //setter method1
		this.loc =loc;
	}

}
class Main {
	public String getName() {
		public static void main(String[]args) {
			Encapsulation e=new Encapsulation();
			System.out.println("Id :"+e.getId());
			System.out.println("Name :"e.getname)
			e.setlocation("Hadrabad")
			System.out.println("location :"e.setloc());
		}
	}
}
//This key word in java:
//flower name is attribute and ist color and all is its property both same
class Flower{
	private String flower_name; //attribute or properties
	
	Flower(String Flower_name){   //constructor  not recquired get or set to access private with the help of constructor
		this.Flower_name=Flower_name; //this key word
		System.out.println("Flower name is :"+Flower_name);
	}
	
	public void Flower_method() {  //flower user define method
		System.out.println("Flower name is :"+Flower_name);
	}
}

public class Main{
	public static void main(string[]args) {
		Flower f = new Flower("Rose");
		f.Flower_method();
	}
}
//
class Flower {
    private String flower_name; // Attribute for flower name
    private String flower_color; // Attribute for flower color
    
    // Constructor to initialize flower name and color
    Flower(String flower_name, String flower_color) {
        this.flower_name = flower_name; // Using 'this' to refer to the instance variable
        this.flower_color = flower_color;
        System.out.println("Flower name is: " + flower_name);
        System.out.println("Flower color is: " + flower_color);
    }
    
    // User-defined method to display flower details
    public void flower_method() {
        System.out.println("Flower name is: " + flower_name);
        System.out.println("Flower color is: " + flower_color);
    }
}

public class Main {
    public static void main(String[] args) { // Corrected 'string' to 'String'
        Flower f = new Flower("Rose", "Red"); // Passing both name and color
        f.flower_method();
    }
}

