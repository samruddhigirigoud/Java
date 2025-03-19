package mypackage;

public class this_keyword {
    private String name;
    private int age;

    public this_keyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name must be a non-empty string");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be non-negative");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public void compareAge(this_keyword other) {
        if (this.age > other.age) {
            System.out.println(this.name + " is older than " + other.name);
        } else if (this.age < other.age) {
            System.out.println(this.name + " is younger than " + other.name);
        } else {
            System.out.println(this.name + " and " + other.name + " are the same age");
        }
    }

    public static void main(String[] args) {
        this_keyword person1 = new this_keyword("Alice", 25);
        this_keyword person2 = new this_keyword("Bob", 30);

        person1.displayInfo();
        person2.displayInfo();

        person1.setName("Charlie");
        person1.setAge(35);
        person1.displayInfo();

        person1.compareAge(person2);

        try {
            person1.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            person2.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}