package Main;
class Employee{
	
private String empname;//attribute or properties
private int empid;
private String empdep;
private String emploc;

Employee(String empname,int empid,String empdep,String emploc){ //constructor
	this.empname=empname; //this keyword, to access the instance variable 
	this.empid=empid;
	this.empdep=empdep;
	this.emploc=emploc;
	System.out.println("flower name is "+empname);
	System.out.println("flower color is "+flowercol);
	System.out.println("flower color is "+flowercol);
	
	
}
public void flowermethod() {
	System.out.println("flower name is in method "+flowername);
}

public void flowercolor() {
	System.out.println("flower name is in method "+flowercol);
}


}

public class This {
public static void main(String[] args) {
	Flower f=new Flower("rose","red");
	f.flowermethod();
	f.flowercolor();
	
}

}

public class Employee {
   
}
