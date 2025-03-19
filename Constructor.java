package Main;
class Fruits{
	Fruits(){ //default,no 2 default class are allowed only 1
		System.out.println("i am fruit1 constructor");
	}
	Fruits(String name){ //parameterised
		System.out.println("fruit name:"+name);
	}
}
class Animal{
	Animal(){
		System.out.println("i am animal");
	}
	Animal(String name,String breed,String owner){
		System.out.println("Dog name:"+name);
		System.out.println("Dog breed:"+breed);
		System.out.println("Dog owner:"+owner);
	}
}

public class Constructor {

	public static void main(String[] args) {
		Fruits obj=new Fruits("orange"); //for the constructor no need to call the obj
		Fruits obj1=new Fruits();
		Animal obj3=new Animal();
		//Animal obj4=new Animal("sheru","lab","mr xyz");
	}

}
