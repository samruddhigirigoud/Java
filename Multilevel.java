//package Main; // Package declaration (optional)

class Parent { // Parent class
    public void parentmethod() { // Parent method
        System.out.println("I am parent method");
    }
}

class Child1 extends Parent { // First child (subclass)
    public void child1method() { // Child1 method
        System.out.println("I am child1 method");
    }
}

class Child2 extends Child1 { // Second child (subclass)
    public void child2method() { // Child2 method
        System.out.println("I am child2 method");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.parentmethod(); // Calls Parent class method
        c.child1method(); // Calls Child1 method

        Child2 c2 = new Child2(); // Correct object creation for Child2
        c2.child2method(); // Calls Child2 method
        c2.child1method(); // Calls Child1 method (inherited from Child1)
        c2.parentmethod(); // Calls Parent method (inherited from Parent)
    }
}
