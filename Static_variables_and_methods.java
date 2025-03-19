//Static variables and Methods in java
class Main {
    static int a = 100; //static var
    int b = 200; //non static or instance var
    
    //
    public static void Static_method(){  //Static method
        System.out.println("Static method");
    }
    
    public void nonstatic_method(){  //non-Static method or instance method
        System.out.println("Non Static / instance method");
    }
    
    
    public static void main(String[] args) {
        System.out.println(" a value :" +a);
        Main m = new Main();
        System.out.println(" b value :"+m.b);
        Static_method();
        m.nonstatic_method();
    }
}