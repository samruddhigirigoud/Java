package mypackage;

class Super{   //user define class
    String name ;
    Super(String name){    //constructor
        this.name = name;   //without this keyword its also run
        System.out.println("my name in constructor(parent) : "+this.name);   //without this keyword its also run
    }
}
class Child extends Super{
    Child(String name){
        super(name);
        System.out.println("my name in constructor(child) : "+this.name);   //without this keyword its also run

    }
    
}
class Main {   //main class
    public static void main(String[] args) {
        Child s = new Child("Aditya");
         
    }
}